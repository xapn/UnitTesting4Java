/**
 * 
 */
package xapn.testing.hamcrest.sugar;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

import xapn.testing.hamcrest.domain.OrdinarySystem;

/**
 * Custom matcher.
 * 
 * @author Xavier Pigeon
 */
public class OrdinaryMatcher {
    
    @Factory
    public static Matcher<OrdinarySystem> lessOrdinary(final OrdinarySystem thanAnother) {
        return new BaseMatcher<OrdinarySystem>() {
            
            private OrdinarySystem expected = thanAnother;
            
            @Override
            public void describeTo(Description description) {
                description.appendText(expected.toString());
            }
            
            @Override
            public boolean matches(Object item) {
                return ((OrdinarySystem) item).getLevel() < expected.getLevel();
            }
        };
    }
    
    @Factory
    public static Matcher<OrdinarySystem> moreOrdinary(final OrdinarySystem thanAnother) {
        return new BaseMatcher<OrdinarySystem>() {
            
            private OrdinarySystem expected = thanAnother;
            
            @Override
            public void describeTo(Description description) {
                description.appendText(expected.toString());
            }
            
            @Override
            public boolean matches(Object item) {
                return ((OrdinarySystem) item).getLevel() > expected.getLevel();
            }
        };
    }
}
