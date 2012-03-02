/*
 * Created on May 26, 2010
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * Copyright @2010 the original author or authors.
 */
package xapn.projects.testing.fest.festassert.extensibility.assertion.character;

import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

/**
 * A simple class to illustrate how to extend Fest assertions with custom ones.
 * 
 * @author Joel Costigliola
 */
public class CharacterAssert extends GenericAssert<CharacterAssert, Character> {
    
    /**
     * An entry point for CharacterAssert to follow Fest standard
     * <code>assertThat()</code> statements.<br>
     * With a static import, one's can write directly :
     * <code>assertThat(frodo).hasName("Frodo");</code>
     * 
     * @param actual the Character we want to make assertions on.
     * @return a new </code>{@link CharacterAssert}</code>
     */
    public static CharacterAssert assertThat(Character actual) {
        return new CharacterAssert(actual);
    }
    
    /**
     * Creates a new </code>{@link CharacterAssert}</code> to make assertions on
     * actual Character.
     * 
     * @param actual the Character we want to make assertions on.
     */
    public CharacterAssert(Character actual) {
        super(CharacterAssert.class, actual);
    }
    
    /**
     * Verifies that the actual Character's name is equal to the given one.
     * 
     * @param name the given name to compare the actual Character's name to.
     * @return this assertion object.
     * @throws AssertionError - if the actual Character's name is not equal to
     *             the given one.
     */
    public CharacterAssert hasName(String name) {
        // Check that actual Character we want to make assertions on is not
        // null.
        isNotNull();
        
        // Check that actual Character's name is equal to the given name (we
        // assume here that Character'name is not null).
        // We overrides the default error message with a more explicit one
        String errorMessage = String
                .format("Expected character's name to be <%s> but was <%s>", name, actual.getName());
        Assertions.assertThat(actual.getName()).overridingErrorMessage(errorMessage).isEqualTo(name);
        
        // We could have used other basic assertions, for example :
        Assertions.assertThat(actual.getName().equals(name)).overridingErrorMessage(errorMessage).isTrue();
        
        // Return the current assertion for method chaining
        return this;
    }
}
