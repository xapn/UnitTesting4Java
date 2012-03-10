/**
 * 
 */
package xapn.testing.testsuite;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Case 1
 * 
 * @author Xavier Pigeon
 */
public class Test1 extends TestCase {
    
    /**
     * Run this test suite as Java Application.
     * There is two ways to define a suite run: here is the dynamic way with
     * reflection.
     * 
     * @param args
     */
    public static void main(String args[]) {
        // Choose between these different solutions:
        junit.textui.TestRunner.run(suite());
        // or:
        junit.textui.TestRunner.run(Test1.class);
        // or:
        junit.awtui.TestRunner.run(Test1.class);
        // or:
        junit.swingui.TestRunner.run(Test1.class);
    }
    
    /**
     * Suite method
     * 
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(Test1.class);
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
        System.out.println("Test1#testSomething");
        assertTrue(true);
    }
    
    /**
     * Test method
     */
    public void testSomethingElse() {
        System.out.println("Test1#testSomethingElse");
        assertEquals(1, 1);
    }
}
