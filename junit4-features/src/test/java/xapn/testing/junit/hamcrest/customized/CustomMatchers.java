/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * Custom Matchers.
 * All the below custom matchers extends the {@link org.hamcrest.BaseMatcher}
 * class.
 * 
 * @author Xavier Pigeon
 */
public class CustomMatchers {
    
    /**
     * From this article: "Simplifier les assertions JUnit et améliorer vos
     * tests", seen at this <a href=
     * "http://blog.xebia.fr/2008/04/02/simplifier-les-assertions-junit-et-ameliorer-vos-tests/"
     * >URL</a>
     * 
     * @param values the expected values
     * @return a {@link org.hamcrest.BaseMatcher} object
     */
    public static <T> Matcher<T> in(final T... values) {
        return new BaseMatcher<T>() {
            
            @Override
            public void describeTo(Description desc) {
                desc.appendText(" in ").appendValue(values);
            }
            
            @Override
            public boolean matches(Object object) {
                // values can never be null !
                // When passing a null value, the JVM creates a 1-length array
                // containing a null.
                if (values.length == 0) {
                    throw new IllegalStateException("in(...) matcher expects a non-empty values argument");
                } else if (object == null) {
                    for (T value : values) {
                        if (value == null) {
                            return true;
                        }
                    }
                    return false;
                } else {
                    for (T value : values) {
                        if (object.equals(value)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        };
    }
    
    /**
     * Test if an object is equal to the expected one.
     * 
     * @param expected the expected object
     * @return a {@link org.hamcrest.BaseMatcher} object
     */
    public static <T> Matcher<T> stringIsEqualTo(final T expected) {
        
        return new BaseMatcher<T>() {
            
            protected T theExpected = expected;
            
            @Override
            public void describeTo(Description description) {
                description.appendText(theExpected.toString());
            }
            
            @Override
            public boolean matches(Object o) {
                return theExpected.equals(o);
            }
        };
    }
}
