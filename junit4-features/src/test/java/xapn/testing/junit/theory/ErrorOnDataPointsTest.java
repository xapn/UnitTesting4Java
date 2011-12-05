/**
 * 
 */
package xapn.testing.junit.theory;

import static org.junit.Assume.assumeTrue;

import org.junit.Ignore;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Theory with data point attributes of String type and data point method of
 * Integer type.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Theories.class)
@Ignore("ParameterizedAssertionError to fix")
public class ErrorOnDataPointsTest {
    
    @DataPoints
    public static String[] letters = new String[] { "a", "b", "c" };
    
    @DataPoints
    public static Integer[] generateDigitData() {
        return new Integer[] { 0, 1, 2 };
    }
    
    @Theory
    public void testWithTwoDigits(Integer x, Integer y) {
        assumeTrue(x != y);
        System.out.println(x + " " + y);
    }
    
    @Theory
    public void testWithTwoLetters(String x, String y) {
        assumeTrue(!x.equals(y));
        System.out.println(x + " " + y);
    }
}
