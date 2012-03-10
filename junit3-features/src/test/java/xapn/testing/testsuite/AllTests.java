/**
 * 
 */
package xapn.testing.testsuite;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * JUnit 3 Test Suite containing all the unit tests inside the testsuite
 * package.
 * 
 * @author Xavier Pigeon
 */
public class AllTests {
    
    /**
     * Run this test suite as Java Application.
     * 
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(suite());
    }
    
    /**
     * Run this test as JUnit Test.
     * 
     * @return a {@link junit.framework.Test}
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("All the tests from xapn.testing.testsuite");
        // $JUnit-BEGIN$
        suite.addTestSuite(Test1.class);
        suite.addTestSuite(Test2.class);
        // $JUnit-END$
        return suite;
    }
    
    /**
     * Run this test as JUnit Test.
     * 
     * @return a {@link junit.framework.Test}
     */
    public static Test otherSuite() {
        TestSuite suite = new TestSuite("All the tests from xapn.testing.testsuite");
        // $JUnit-BEGIN$
        suite.addTest(Test1.suite());
        suite.addTest(Test2.suite());
        // $JUnit-END$
        return suite;
    }
}
