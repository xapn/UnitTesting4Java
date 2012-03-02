/**
 * 
 */
package xapn.projects.testing.fest.festassert.extensibility.assertion.iterable;

import static xapn.projects.testing.fest.festassert.extensibility.assertion.iterable.CustomIteratorAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.fest.assertions.Condition;
import org.junit.Test;

/**
 * Example of using a custom assertion.
 * 
 * @author Xavier Pigeon
 */
public class CustomIteratorExample {
    
    @Test
    public void assertThat_list_eachSatisfies_condition() {
        List<Integer> ageList = Arrays.asList(91, 18, 30, 45);
        
        assertThat(ageList).eachSatisfies(new Condition<Integer>() {
            
            @Override
            public boolean matches(Integer value) {
                return value >= 18;
            }
        });
    }
}
