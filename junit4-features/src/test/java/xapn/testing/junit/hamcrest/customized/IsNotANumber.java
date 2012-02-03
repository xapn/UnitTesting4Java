/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

/**
 * From this Hamcrest tutorial, seen at the following URL:
 * http://code.google.com/p/hamcrest/wiki/Tutorial
 * 
 * @author Xavier Pigeon
 */
public class IsNotANumber extends TypeSafeMatcher<Double> {
    
    @Factory
    public static <T> Matcher<Double> notANumber() {
        return new IsNotANumber();
    }
    
    public void describeTo(Description description) {
        description.appendText("not a number");
    }
    
    @Override
    public boolean matchesSafely(Double number) {
        return number.isNaN();
    }
}
