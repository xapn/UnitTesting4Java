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
 * Theory with multiple data points of different kinds: attributes and method.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Theories.class)
public class MixedDataPointsTest {
    
    @DataPoints
    public static Integer[] digits = new Integer[] { 0, 1, 2 };
    
    @DataPoint
    public static Integer three = 3;
    
    @DataPoints
    public static Integer[] generateDigitData() {
        return new Integer[] { 4, 5 };
    }
    
    @Theory
    public void testWithTwoParameters(Integer x, Integer y) {
        assumeTrue(!x.equals(y));
        System.out.println(x + " " + y);
    }
}
