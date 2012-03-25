/**
 * 
 */
package xapn.testing.junit.rule.custom;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;


/**
 * Verifier is a base class for Rules like ErrorCollector, which can turn
 * otherwise passing test methods into failing tests if a verification check is
 * failed.
 * 
 * @author Xavier Pigeon
 */
public class UsesVerifierTest {
    
    private ErrorLog errorLog = new ErrorLog();
    
    @Rule
    public TestRule verifier = new Verifier() {
        
        @Override
        public void verify() {
            assertTrue(errorLog.isEmpty());
        }
    };
    
    @Test
    public void testThatMightWriteErrorLog() {
        // ...
    }
}
