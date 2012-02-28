/**
 * 
 */
package xapn.testing.junit.hamcrest.parameterizedtest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Parameterized Test with Hamcrest Matchers.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Parameterized.class)
public class ParameterizedTestWithMatchers {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 1, greaterThan(0) }, { 0, not(greaterThan(1)) },
                { 2, allOf(greaterThan(1), lessThan(3)) }, { 4, allOf(greaterThan(1), lessThan(5)) }, });
    }
    
    private int value;
    private Matcher<Object> expectedValue;
    
    public ParameterizedTestWithMatchers(int value, Matcher<Object> expectedValue) {
        this.value = value;
        this.expectedValue = expectedValue;
    }
    
    private String describeExpectations() {
        return Integer.toString(value) + " should be " + expectedValue.toString();
    }
    
    @Test
    public void valueShouldMatchExpectations() {
        assertThat(describeExpectations(), expectedValue.matches(value), is(true));
    }
}
