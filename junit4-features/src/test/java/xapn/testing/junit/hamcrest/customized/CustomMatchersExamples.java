/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static xapn.testing.junit.hamcrest.customized.CustomMatchers.stringIsEqualTo;

import org.junit.Before;
import org.junit.Test;

import xapn.testing.junit.hamcrest.Greeter;

/**
 * Examples of using some custom matchers.
 * 
 * @author Xavier Pigeon
 */
public class CustomMatchersExamples {
    
    private static final String HELLO_WORLD = "Hello World";
    private Greeter greeter;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        greeter = new Greeter();
    }
    
    /**
     * Example of using the in matcher
     */
    @Test
    public void testIn() {
        assertThat("abc", allOf(notNullValue(), not(CustomMatchers.in("def", "ghi"))));
    }
    
    /**
     * Example of using the stringIsEqualTo matcher
     */
    @Test
    public void testStringIsEqualTo() {
        assertThat(greeter.greeting(), stringIsEqualTo(HELLO_WORLD));
    }
}
