/**
 * 
 */
package xapn.testing.hamcrest.sugar;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import xapn.testing.hamcrest.domain.OrdinarySystem;

/**
 * Custom matcher.
 * 
 * @author Xavier Pigeon
 */
public class ReadyMatcher extends TypeSafeMatcher<OrdinarySystem> {
    
    @Factory
    public static Matcher<OrdinarySystem> ready() {
        return new ReadyMatcher();
    }
    
    @Override
    public void describeTo(Description description) {
        description.appendText("Should be ready.");
    }
    
    @Override
    public boolean matchesSafely(OrdinarySystem ordinarySystem) {
        return ordinarySystem.isReady();
    }
}
