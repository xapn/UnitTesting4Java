/**
 * 
 */
package xapn.testing.junit.junitaddons;

import static junitx.framework.ComparableAssert.assertGreater;
import static junitx.framework.ComparableAssert.assertLesser;
import static junitx.framework.ComparableAssert.assertNotGreater;
import static junitx.framework.ComparableAssert.assertNotLesser;
import static junitx.framework.ObjectAssert.assertInstanceOf;
import static junitx.framework.ObjectAssert.assertNotInstanceOf;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import junitx.framework.ArrayAssert;
import junitx.framework.ComparableAssert;
import junitx.framework.FileAssert;
import junitx.framework.ListAssert;
import junitx.framework.ObjectAssert;

/**
 * Test Case using JUnit-addons
 * 
 * @author Xavier Pigeon
 */
public class JUnitAddonSampleTest extends TestCase {
    
    private static final String DIRECTORY = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    
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
     * Test method using junix.framework helpers
     */
    public void testSample() {
        // junitx.framework.ArrayAssert.assertXXX(YYY[],ZZZ[])
        ArrayAssert.assertEquals(new String[] { "value1", "value2" }, new String[] { "value1", "value2" });
        ArrayAssert.assertEquivalenceArrays(new String[] { "value1", "value2" }, new String[] { "value1", "value2" });
        
        // junitx.framework.ComparableAssert.assertXXX(Comparable expected,
        // Comparable actual)
        ComparableAssert.assertEquals(180, 180);
        assertGreater(125, 180);
        assertLesser(125, 18);
        assertNotGreater(125, 18);
        assertNotLesser(125, 180);
        
        // junitx.framework.FileAssert.assertXXX(java.io.File, java.io.File)
        FileAssert.assertBinaryEquals(new File(DIRECTORY + "expectedFile"), new File(DIRECTORY + "actualFile"));
        FileAssert.assertEquals(new File(DIRECTORY + "expectedFile"), new File(DIRECTORY + "actualFile"));
        
        // junitx.framework.ListAssert.assertXXX(...)
        List<String> myList = new ArrayList<String>();
        myList.add("abc");
        ListAssert.assertContains(myList, "abc");
        ListAssert.assertEquals(new ArrayList(), new ArrayList());
        
        // junitx.framework.ObjectAssert.assertXXX(...)
        assertInstanceOf(String.class, "abc");
        assertNotInstanceOf(Integer.class, "abc");
        ObjectAssert.assertNotSame("expected", "actual");
        ObjectAssert.assertSame("abc", "abc");
    }
}
