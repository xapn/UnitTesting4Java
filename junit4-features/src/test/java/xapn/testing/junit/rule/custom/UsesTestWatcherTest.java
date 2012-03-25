/**
 * 
 */
package xapn.testing.junit.rule.custom;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * TestWatcher is a base class for Rules that take note of the testing action,
 * without modifying it. For example, this class will keep a log of each passing
 * and failing test.
 * 
 * @author Xavier Pigeon
 */
public class UsesTestWatcherTest {
    
    @Rule
    public TestRule watchman = new TestWatcher() {
        
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println(description.getMethodName() + " method returned " + e.getClass().getSimpleName() + ": "
                    + e.getMessage() + " :-(");
        }
        
        @Override
        protected void finished(Description description) {
            System.out.println(description.getMethodName() + " finished.");
        };
        
        @Override
        protected void starting(Description description) {
            System.out.println("Starting " + description.getMethodName() + "...");
        }
        
        @Override
        protected void succeeded(Description description) {
            System.out.println(description.getMethodName() + " method succeeded! :-)");
        }
    };
    
    @Test
    public void should_fail() {
        System.out.println("<Run a process to be tested>");
        fail("Failed!");
    }
    
    @Test
    public void should_succeed() {
        System.out.println("<Run a process to be tested>");
        assertTrue(true);
    }
}
