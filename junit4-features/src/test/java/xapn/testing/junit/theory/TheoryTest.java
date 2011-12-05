/**
 * 
 */
package xapn.testing.junit.theory;

import static org.junit.Assume.assumeTrue;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * This test is executed by a specialized runner of type
 * {@link org.junit.experimental.theories.Theories}. This runner executes all
 * the public methods annotated with @Theory.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Theories.class)
public class TheoryTest {
    
    @DataPoint
    public static String a = "a";
    
    @DataPoint
    public static String b = "bb";
    
    @DataPoint
    public static String c = "ccc";
    
    /**
     * Differently from normal tests theories have parameters. In order to fill
     * these parameters with values, the Theories runner uses all the public
     * fields of matching Type and annotated with @DataPoint.
     * 
     * @param x
     * @param y
     */
    @Theory
    public void testString(String x, String y) {
        System.out.println(x + " " + y);
    }
    
    /**
     * A probably very common case is that a theory is known not to be valid for
     * certain cases. You can exclude these from a test using the {@link Assume}
     * class.
     * If an assumption doesn’t hold, the test is silently ignored. This is used
     * in the example above to prevent ‘a’ to be used as a first parameter.
     * 
     * @param x
     * @param y
     */
    @Theory
    public void testStringExcludingCertainCases(String x, String y) {
        assumeTrue(x.length() > 1);
        
        System.out.println(x + " " + y);
    }
}
