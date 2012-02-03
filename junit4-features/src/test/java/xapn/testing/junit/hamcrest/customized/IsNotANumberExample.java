/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static xapn.testing.junit.hamcrest.customized.IsNotANumber.notANumber;

import org.junit.Test;

/**
 * Example of using the {@link xapn.testing.junit.hamcrest.customized.IsNotANumber}
 * matcher.
 * 
 * @author Xavier Pigeon
 */
public class IsNotANumberExample {
    
    /**
     * Testing if a double value has the value NaN (not a number).
     */
    @Test
    public void testSquareRootOfMinusOneIsNotANumber() {
        assertThat(Math.sqrt(-1), is(notANumber()));
    }
}
