/**
 * 
 */
package xapn.testing.junit.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Simple Test Case
 * 
 * @author Xavier Pigeon
 */
public class SimpleTest {
    
    /**
     * Set up a fixture shared by all the tests in the class.
     * It can compromise the independence of tests, but be a necessary
     * optimization for allocating expensive external resources.
     * (Called once before any of the test methods in the class.)
     * 
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() {}
    
    /**
     * Tear down a fixture shared by all the tests in the class.
     * It releases allocated expensive external resources.
     * (Called once after any of the test methods in the class.)
     * 
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() {}
    
    private java.util.List<Object> emptyList;
    
    /**
     * Set up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        emptyList = new java.util.ArrayList<Object>();
    }
    
    /**
     * Tear down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
        emptyList = null;
    }
    
    /**
     * Test method specifying an expected {@link java.lang.Throwable} object.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testForException() {
        Object o = emptyList.get(0);
    }
    
    /**
     * Test method verifying some behavior.
     */
    @Test
    public void testSomeBehavior() {
        assertEquals("Empty list should have 0 elements", 0, emptyList.size());
    }
}
