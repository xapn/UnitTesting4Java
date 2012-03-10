/**
 * 
 */
package xapn.testing.testsuite;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Case 2
 * 
 * @author Xavier Pigeon
 */
public class Test2 extends TestCase {
    
    /**
     * Run this test suite as Java Application.
     * There is two ways to define a suite run: here is the static way with the
     * suite() method.
     * 
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(suite());
    }
    
    /**
     * Suite method
     * 
     * @return the suite of tests being tested
     */
    public static Test suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new Test2("testSomething"));
        testSuite.addTest(new Test2("testSomethingElse"));
        
        return testSuite;
    }
    
    public Test2(String testName) {
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
     * Test method
     */
    public void testSomething() {
        System.out.println("Test2#testSomething");
        assertTrue(true);
    }
    
    /**
     * Test method
     */
    public void testSomethingElse() {
        System.out.println("Test2#testSomethingElse");
        assertEquals(1, 1);
    }
}
