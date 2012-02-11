/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * To test an asynchronous request, a handler can be used from the test case
 * that records what is passed in. The test can then wait for a specified time
 * and assert that the correct result is received. If the asynchronous code does
 * not complete within the specified time, the test will fail (suggesting the
 * code is either running very slowly or is never going to complete).
 * <ul>
 * <li>Test method 1: this way would slow a test suite right down.</li>
 * <li>Test method 2: a less time consuming way with a notification.</li>
 * <li>Test method 3: to prove that the previous way is imperfect.</li>
 * <li>Test method 4: the right way, with a count-down latch.</li>
 * </ul>
 * 
 * @author Xavier Pigeon
 */
public class PriceFinderTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceFinderTest.class);
    private static final int LATCH_COUNT = 1;
    
    // Object under test
    private PriceFinder priceFinder;
    
    private Price receivedPrice;
    private Object lock = new Object();
    // Latch used in the fourth test method
    private CountDownLatch latch4 = new CountDownLatch(LATCH_COUNT);
    
    @Before
    public void setUp() throws Exception {
        priceFinder = new PriceFinder();
        priceFinder.setPriceService(new PriceService());
    }
    
    @After
    public void tearDown() throws Exception {}
    
    /**
     * The test waits for 2 seconds, while the service returns a response in 1
     * second.
     * Test performed in about 2000 milliseconds.
     */
    @Test
    public void testRetrievesAValidPrice1() throws Exception {
        LOGGER.debug("testRetrievesAValidPrice1");
        
        long startTime = System.currentTimeMillis();
        
        priceFinder.findPrice("MSFT", new IPriceHandler() {
            
            @Override
            public void foundPrice(Price price) {
                receivedPrice = price;
                LOGGER.debug("Price received");
            }
        });
        
        // Smelly!
        Thread.sleep(2000); // Wait two seconds.
        
        long endTime = System.currentTimeMillis();
        LOGGER.debug("Test performed in {} ms", endTime - startTime);
        
        assertNotNull("Expected a price", receivedPrice);
    }
    
    /**
     * A less time consuming way to do it is by using wait() and notify() on a
     * lock. The handler notifies the lock and the test waits for this
     * notification. In case this notification never happens, a timeout is used
     * when calling wait().
     * Test performed in about 1000 milliseconds.
     */
    @Test
    public void testRetrievesAValidPrice2() throws Exception {
        LOGGER.debug("testRetrievesAValidPrice2");
        
        long startTime = System.currentTimeMillis();
        
        priceFinder.findPrice("MSFT", new IPriceHandler() {
            
            @Override
            public void foundPrice(Price price) {
                receivedPrice = price;
                LOGGER.debug("Price received");
                synchronized (lock) {
                    lock.notify();
                }
            }
        });
        
        synchronized (lock) {
            lock.wait(2000); // Wait two seconds or until the
                             // monitor has been notified.
                             // But there's still a problem...
        }
        
        long endTime = System.currentTimeMillis();
        LOGGER.debug("Test performed in {} ms", endTime - startTime);
        
        assertNotNull("Expected a price", receivedPrice);
    }
    
    /**
     * In this test method, the PriceFinder receives a response before the test
     * starts waiting. Test performed in about 3500 milliseconds.
     */
    @Test
    public void testRetrievesAValidPrice3() throws Exception {
        LOGGER.debug("testRetrievesAValidPrice3");
        
        long startTime = System.currentTimeMillis();
        
        priceFinder.findPrice("MSFT", new IPriceHandler() {
            
            @Override
            public void foundPrice(Price price) {
                receivedPrice = price;
                LOGGER.debug("Price received");
                synchronized (lock) {
                    lock.notify();
                }
            }
        });
        
        // In the case that the PriceFinder is really fast, it may call notify()
        // before the test starts wait()ing. The test will still pass, but it
        // will wait until the timeout occurs.
        Thread.sleep(1500);
        
        synchronized (lock) {
            lock.wait(2000); // Wait two seconds or until the
                             // monitor has been notified.
                             // But there's still a problem...
        }
        
        long endTime = System.currentTimeMillis();
        LOGGER.debug("Test performed in {} ms", endTime - startTime);
        
        assertNotNull("Expected a price", receivedPrice);
    }
    
    /**
     * A latch can only be locked once, once released it will never lock again.
     * Test performed in about 1500 milliseconds.
     */
    @Test
    public void testRetrievesAValidPrice4() throws Exception {
        LOGGER.debug("testRetrievesAValidPrice4");
        
        long startTime = System.currentTimeMillis();
        
        priceFinder.findPrice("MSFT", new IPriceHandler() {
            
            @Override
            public void foundPrice(Price price) {
                receivedPrice = price;
                LOGGER.debug("Price received");
                latch4.countDown();
            }
        });
        
        Thread.sleep(1500);
        
        // Wait until the latch is released or a timeout occurs.
        latch4.await(2000, TimeUnit.MILLISECONDS);
        
        long endTime = System.currentTimeMillis();
        LOGGER.debug("Test performed in {} ms", endTime - startTime);
        
        assertNotNull("Expected a price", receivedPrice);
    }
}
