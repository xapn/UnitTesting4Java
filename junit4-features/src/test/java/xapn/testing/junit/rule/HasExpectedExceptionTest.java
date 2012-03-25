/**
 * 
 */
package xapn.testing.junit.rule;

import static org.hamcrest.text.StringStartsWith.startsWith;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * The ExpectedException Rule allows in-test specification of expected exception
 * types and messages.<br/>
 * These tests all pass.
 * 
 * @author Xavier Pigeon
 */
public class HasExpectedExceptionTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none(); // initialized.
    
    @Test
    public void throwsNothing() {
        // No exception expected, none thrown: passes.
    }
    
    @Test
    public void throwsNullPointerException() {
        // Setup
        thrown.expect(NullPointerException.class);
        
        // Process
        throw new NullPointerException();
    }
    
    @Test
    public void throwsNullPointerExceptionWithMessage() {
        // Setup
        // For the expected exception type:
        thrown.expect(NullPointerException.class);
        // For the expected exception message: it should contain the given
        // substring.
        thrown.expectMessage("happened?");
        // For the expected exception message: it should satisfy the given
        // Hamcrest matcher.
        thrown.expectMessage(startsWith("What"));
        
        // Process
        throw new NullPointerException("What happened?");
    }
}
