/**
 * 
 */
package xapn.testing.junit.rule;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * The TestName Rule makes the current test name available inside test methods.
 * 
 * @author Xavier Pigeon
 */
public class UsesTestNameTest {
    
    @Rule
    public TestName name = new TestName();
    
    @Test
    public void testA() {
        assertEquals("testA", name.getMethodName());
    }
    
    @Test
    public void testB() {
        assertEquals("testB", name.getMethodName());
    }
}
