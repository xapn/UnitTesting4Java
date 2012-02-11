/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This service can be a web-service, a database call or a JMS message.
 * 
 * @author Xavier Pigeon
 */
public class PriceService {
    
    /**
     * Price thread that finds the wanted price.</br>
     * This thread makes the
     * {@link PriceService#findPrice(String, IPriceHandler)} method
     * asynchronous.
     * 
     * @author Xavier Pigeon
     */
    class PriceThread extends Thread {
        
        private IPriceHandler handler;
        
        /**
         * Constructor.
         * 
         * @param handler a {@link IPriceHandler} object
         */
        public PriceThread(IPriceHandler handler) {
            this.handler = handler;
        }
        
        @Override
        public void run() {
            Price price = new Price();
            
            try {
                LOGGER.debug("Sleeping...");
                Thread.sleep(DELAY);
                LOGGER.debug("Handler calling");
                handler.foundPrice(price);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceService.class);
    private static final int DELAY = 1000;
    
    /**
     * Find the price of a symbol.</br>
     * This method is asynchronous. Retrieving a price is simulated with a
     * <code>Thread.sleep(DELAY);</code> of one second.
     * 
     * @param symbol the symbol to be searched
     * @param handler the handler to be called after the symbol was found
     */
    public void findPrice(String symbol, IPriceHandler handler) {
        new PriceThread(handler).start();
    }
}
