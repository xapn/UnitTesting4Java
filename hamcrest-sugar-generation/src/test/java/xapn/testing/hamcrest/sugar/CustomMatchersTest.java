/**
 * 
 */
package xapn.testing.hamcrest.sugar;

import static org.hamcrest.MatcherAssert.assertThat;
import static xapn.testing.hamcrest.sugar.OrdinaryMatcher.lessOrdinary;
import static xapn.testing.hamcrest.sugar.OrdinaryMatcher.moreOrdinary;
import static xapn.testing.hamcrest.sugar.PowerfulMatcher.powerful;
import static xapn.testing.hamcrest.sugar.ReadyMatcher.ready;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import xapn.testing.hamcrest.domain.OrdinarySystem;

/**
 * Example of using several custom matchers, with as much static imports.
 * 
 * @author Xavier Pigeon
 */
public class CustomMatchersTest {
    
    private OrdinarySystem actual;
    private OrdinarySystem expected;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        actual = new OrdinarySystem();
    }
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    @Test
    public void testLessOrdinary() {
        expected = new OrdinarySystem(3, 12, true);
        actual.setLevel(1);
        
        assertThat(actual, lessOrdinary(expected));
    }
    
    @Test
    public void testMoreOrdinary() {
        expected = new OrdinarySystem(3, 12, true);
        actual.setLevel(5);
        
        assertThat(actual, moreOrdinary(expected));
    }
    
    @Test
    public void testPowerful() {
        actual.setPower(1);
        
        assertThat(actual, powerful());
    }
    
    @Test
    public void testReady() {
        actual.setReady(true);
        
        assertThat(actual, ready());
    }
}
