/**
 * 
 */
package xapn.testing.junit.theory;

import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Theory with several attributes of different types as data points.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Theories.class)
public class DataPointAttributesTest {
    
    @DataPoints
    public static Integer[] digits = new Integer[] { 0, 1, 2 };
    
    @DataPoints
    public static String[] letters = new String[] { "a", "b", "c" };
    
    @DataPoint
    public static String word = "word";
    
    @Theory
    public void testWithOneParameter(String x) {
        System.out.println("testWithOneParameter: " + x);
    }
    
    @Theory
    public void testWithTwoParameters(String x, Integer y) {
        assumeTrue(!x.equals(y));
        System.out.println("testWithTwoParameters: " + x + " " + y);
    }
}
