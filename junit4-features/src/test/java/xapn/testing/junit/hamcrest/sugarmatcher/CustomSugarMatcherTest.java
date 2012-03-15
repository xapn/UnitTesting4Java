/**
 * 
 */
package xapn.testing.junit.hamcrest.sugarmatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static xapn.testing.hamcrest.generated.MyMatchers.lessOrdinary;
import static xapn.testing.hamcrest.generated.MyMatchers.moreOrdinary;
import static xapn.testing.hamcrest.generated.MyMatchers.powerful;
import static xapn.testing.hamcrest.generated.MyMatchers.ready;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import xapn.testing.hamcrest.domain.OrdinarySystem;

/**
 * Example of using a custom generated matcher gotten by the Hamcrest sugar
 * generation.
 * 
 * @author Xavier Pigeon
 */
public class CustomSugarMatcherTest {
    
    private OrdinarySystem actual;
    private OrdinarySystem expected;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        actual = new OrdinarySystem(3, 12, true);
    }
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    @Test
    public void testLessOrdinary() {
        expected = new OrdinarySystem(5, 12, true);
        assertThat(actual, lessOrdinary(expected));
    }
    
    @Test
    public void testMoreOrdinary() {
        expected = new OrdinarySystem(1, 12, true);
        assertThat(actual, moreOrdinary(expected));
    }
    
    @Test
    public void testPowerful() {
        assertThat(actual, powerful());
    }
    
    @Test
    public void testReady() {
        assertThat(actual, ready());
    }
}
