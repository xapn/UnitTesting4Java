/**
 * 
 */
package xapn.testing.junit.theory;

import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Theory with methods as data points.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Theories.class)
public class DataPointMethodsTest {
    
    @DataPoints
    public static Integer[] generateDigitData() {
        return new Integer[] { 0, 1, 2 };
    }
    
    @DataPoints
    public static Integer[] generateNegativeNumbers() {
        return new Integer[] { -3, -4 };
    }
    
    @Theory
    public void testWithTwoDigits(Integer x, Integer y) {
        assumeTrue(x != y);
        System.out.println(x + " " + y);
    }
}
