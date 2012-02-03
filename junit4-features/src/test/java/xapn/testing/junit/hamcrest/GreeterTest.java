/**
 * 
 */
package xapn.testing.junit.hamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Case for {@link xapn.testing.junit.hamcrest.Greeter}</br>
 * This codebase shows how to change assertEquals rules into assertThat rules
 * with Hamcrest.
 * 
 * @author Xavier Pigeon
 */
public class GreeterTest {
    
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
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    /**
     * Test method for {@link xapn.testing.junit.hamcrest.Greeter#greeting()}.
     */
    @Test
    public void testGreeting() {
        System.out.println("testGreeting");
        
        // Traditional JUnit assertions:
        assertEquals(HELLO_WORLD, greeter.greeting());
        
        // Using the Hamcrest matchers:
        assertThat(HELLO_WORLD, is(equalTo(greeter.greeting())));
    }
}
