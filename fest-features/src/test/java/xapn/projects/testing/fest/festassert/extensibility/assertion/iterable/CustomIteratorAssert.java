/**
 * 
 */
package xapn.projects.testing.fest.festassert.extensibility.assertion.iterable;

import org.fest.assertions.Condition;
import org.fest.assertions.IteratorAssert;

/**
 * Custom Iterable Assert.
 * 
 * @author Xavier Pigeon
 */
public class CustomIteratorAssert<T> extends IteratorAssert {
    
    public static <T> CustomIteratorAssert<T> assertThat(Iterable<T> actual) {
        return new CustomIteratorAssert<T>(actual);
    }
    
    private final Iterable<T> actualIterable;
    
    public CustomIteratorAssert(Iterable<T> actual) {
        super(actual.iterator());
        actualIterable = actual;
    }
    
    public CustomIteratorAssert<T> eachSatisfies(Condition<T> condition) {
        long notMatching = 0;
        StringBuilder notMatchingDescription = new StringBuilder();
        long index = 0;
        
        for (T value : actualIterable) {
            if (!condition.matches(value)) {
                notMatching++;
                notMatchingDescription //
                        .append("Element ") //
                        .append(index) //
                        .append(", [") //
                        .append(value.toString()) //
                        .append("] does not match condition: ") //
                        .append(condition.description()) //
                        .append("\n");
            }
            index++;
        }
        
        if (notMatching == 0) {
            return this;
        }
        
        failIfCustomMessageIsSet();
        throw failure(notMatching + " element(s) in the iterable not matching the provided condition:\n"
                + notMatchingDescription.toString());
    }
}
