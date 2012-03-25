/**
 * 
 */
package xapn.testing.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

/**
 * The Timeout Rule applies the same timeout to all test methods in a class.
 * 
 * @author Xavier Pigeon
 */
public class HasGlobalTimeoutTest {
    
    public static String log;
    
    @Rule
    public TestRule globalTimeout = new Timeout(20);
    
    @Test
    public void testInfiniteLoop1() {
        log += "ran1";
        for (;;) {}
    }
    
    @Test
    public void testInfiniteLoop2() {
        log += "ran2";
        for (;;) {}
    }
}
