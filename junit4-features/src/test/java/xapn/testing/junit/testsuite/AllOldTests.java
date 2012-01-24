/**
 * 
 */
package xapn.testing.junit.testsuite;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * All test cases in one test method using a {@link TestSuite} object
 * 
 * @author Xavier Pigeon
 */
public class AllOldTests {
    
    /**
     * Run this test suite as Java Application.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("AllOldTests#main()");
        junit.textui.TestRunner.run(suite()); // JUnit 3 TestRunner still works.
        System.out.println("========================== OR ==============================");
        org.junit.runner.JUnitCore.runClasses(new Class[] { OldTest1.class, OldTest2.class });
    }
    
    /**
     * Run this test as JUnit Test, after renaming this suite method to suite().
     * 
     * @return a {@link junit.framework.Test}
     */
    public static Test oldJUnitWaySuite() {
        System.out.println("AllOldTests#oldJUnitWaySuite()");
        TestSuite suite = new TestSuite("All tests for xapn.testing.junit.testsuite package");
        suite.addTest(new TestSuite(OldTest1.class));
        suite.addTest(new TestSuite(OldTest2.class));
        
        return suite;
    }
    
    /**
     * Run this test as JUnit Test.
     * The only possible signature for a suite method is
     * "public static Test suite()".
     * 
     * @return a {@link junit.framework.Test}
     */
    public static Test suite() {
        System.out.println("AllOldTest#suite()");
        return new TestSuite(new Class[] { OldTest1.class, OldTest2.class });
    }
}
