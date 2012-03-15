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
public class PowerfulMatcher extends TypeSafeMatcher<OrdinarySystem> {
    
    @Factory
    public static Matcher<OrdinarySystem> powerful() {
        return new PowerfulMatcher();
    }
    
    @Override
    public void describeTo(Description description) {
        description.appendText("Should be powerful.");
    }
    
    @Override
    public boolean matchesSafely(OrdinarySystem ordinarySystem) {
        return ordinarySystem.getPower() > 0;
    }
}
