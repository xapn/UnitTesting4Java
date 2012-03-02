package xapn.projects.testing.fest.festassert.extensibility.assertion.character;

import static org.fest.assertions.Assertions.assertThat;
import static xapn.projects.testing.fest.festassert.extensibility.assertion.character.CharacterAssert.assertThat;

import org.junit.Test;

/**
 * Examples of using a custom assertion.
 * 
 * @author Xavier Pigeon
 */
public class CharacterAssertExamples {
    
    @Test
    public void failed_custom_assertion_example() {
        Character sam = new Character("Merry", 38, Race.HOBBIT); // Oops wrong
                                                                 // name!
        try {
            // Custom assertion: assertThat is resolved from CharacterAssert
            // static import.
            assertThat(sam).hasName("Sam");
        } catch (AssertionError e) {
            // See that error message is explicit.
            assertThat(e).hasMessage("Expected character's name to be <Sam> but was <Merry>");
        }
    }
    
    @Test
    public void succesful_custom_assertion_example() {
        Character frodo = new Character("Frodo", 33, Race.HOBBIT);
        Character merry = new Character("Merry", 36, Race.HOBBIT);
        // Custom assertion: assertThat is resolved from CharacterAssert static
        // import.
        assertThat(frodo).hasName("Frodo");
        // Fest standard assertion: assertThat is resolved from
        // org.fest.assertions.Assertions static import.
        assertThat(frodo.getAge()).isEqualTo(33);
        // Generic assertion like 'isNotEqualTo' are available for
        // CharacterAssert.
        assertThat(frodo).isNotEqualTo(merry);
    }
}
