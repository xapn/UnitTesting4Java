/**
 * 
 */
package xapn.projects.testing.fest.festassert.extensibility.condition;

import static org.fest.util.Strings.isEmpty;

import org.fest.assertions.Condition;

/**
 * Custom Upper Case Condition.
 * 
 * @author Xavier Pigeon
 */
class UpperCaseCondition extends Condition<String> {
    
    private static final String DESCRIPTION = "Uppercase";
    
    public static UpperCaseCondition isUpperCase() {
        return new UpperCaseCondition(DESCRIPTION);
    }
    
    public static UpperCaseCondition upperCase() {
        return isUpperCase();
    }
    
    private UpperCaseCondition(String description) {
        super(description);
    }
    
    @Override
    public boolean matches(String value) {
        return !isEmpty(value) && value.equals(value.toUpperCase());
    }
}
