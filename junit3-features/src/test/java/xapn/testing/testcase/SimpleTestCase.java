/**
 * 
 */
package xapn.testing.testcase;

import junit.framework.TestCase;
import junit.framework.TestResult;

/**
 * Simple test case
 * 
 * @author Xavier Pigeon
 */
public class SimpleTestCase extends TestCase {
    
    /**
     * Run as Java Application.
     * The following code lines run only the named test methods.
     * 
     * @param args the args from command line
     */
    public static void main(String[] args) {
        TestCase testCase = new SimpleTestCase("testSomething");
        TestResult result = testCase.run();
        assertTrue(result.wasSuccessful());
        
        testCase = new SimpleTestCase("testSomethingElse");
        result = testCase.run();
        assertTrue(result.wasSuccessful());
    }
    
    /**
     * Default constructor
     */
    public SimpleTestCase() {
        super();
    }
    
    /**
     * Constructor
     * 
     * @param testName the test name
     */
    public SimpleTestCase(String testName) {
        super(testName);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * Test something
     */
    public void testSomething() {
        System.out.println("TEST: testSomething");
        assertTrue(true);
    }
    
    /**
     * Test something else
     */
    public void testSomethingElse() {
        System.out.println("TEST: testSomethingElse");
        assertFalse(false);
        // fail();
    }
}
