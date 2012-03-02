/**
 * 
 */
package xapn.projects.testing.fest.festassert.extensibility.condition;

import static org.fest.assertions.Assertions.assertThat;
import static xapn.projects.testing.fest.festassert.extensibility.condition.UpperCaseCondition.isUpperCase;
import static xapn.projects.testing.fest.festassert.extensibility.condition.UpperCaseCondition.upperCase;

import java.util.Arrays;
import java.util.List;

import org.fest.assertions.Condition;
import org.junit.Test;

/**
 * FEST-Assert extensibility through custom conditions.
 * 
 * @author Xavier Pigeon
 */
public class CustomConditionTest {
    
    @Test
    public void assertThat_list_satisfies_condition() {
        List<Integer> ageList = Arrays.asList(91, 18, 30, 45);
        assertThat(ageList).satisfies(new Condition<List<?>>() {
            
            @Override
            public boolean matches(List<?> value) {
                boolean matching = true;
                @SuppressWarnings("unchecked")
                List<Integer> ages = (List<Integer>) value;
                
                for (Integer age : ages) {
                    if (age < 18) {
                        matching = false;
                        break;
                    }
                }
                
                return matching;
            }
        });
    }
    
    @Test
    public void assertThat_string_is_upperCase() {
        assertThat("HELLO").as("Greeting").is(upperCase());
    }
    
    @Test
    public void assertThat_string_satisfies_isUpperCase() {
        assertThat("HELLO").as("Greeting").satisfies(isUpperCase());
    }
}
