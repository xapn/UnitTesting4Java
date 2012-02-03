/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import java.util.Collection;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

/**
 * Custom matcher that tests if a given list only has even numbers.
 * From this article: Using Hamcrest and JUnit, seen at the following URL:
 * http://rafaelnaufal.com/blog/2010/03/15/using-hamcrest-and-junit/
 * 
 * @author Xavier Pigeon
 */
public class AreEvenNumbers extends TypeSafeMatcher<Collection<Integer>> {
    
    @Factory
    public static <T> Matcher<Collection<Integer>> evenNumbers() {
        return new AreEvenNumbers();
    }
    
    @Override
    public void describeTo(Description description) {
        description.appendText("even numbers");
    }
    
    @Override
    public boolean matchesSafely(Collection<Integer> numbers) {
        for (Integer number : numbers) {
            if ((number % 2) != 0) {
                return false;
            }
        }
        return true;
    }
}
