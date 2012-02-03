/**
 * 
 */
package xapn.testing.junit.hamcrest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Test;

/**
 * These examples use the Hamcrest Core Matchers.
 * From this article: JUnit 4 with Hamcrest, seen at this <a
 * href="http://edgibbs.com/junit-4-with-hamcrest/">URL</a>.
 * 
 * @author Xavier Pigeon
 */
public class HamcrestExamples {
    
    /**
     * allOf example shows all matchers must all be true
     * 
     * @throws Exception
     */
    @Test
    public void allOfExampleShowsAllMatchersMustAllBeTrue() throws Exception {
        assertThat("Hello", is(allOf(notNullValue(), instanceOf(String.class), equalTo("Hello"))));
    }
    
    /**
     * allOf Example shows failing if one matcher does not match
     * 
     * @throws Exception
     */
    @Test
    public void allOfExampleShowsFailingIfOneMatcherDoesNotMatch() throws Exception {
        assertThat("Hello", is(not(allOf(notNullValue(), instanceOf(Integer.class)))));
    }
    
    /**
     * any example checks that class is of same type
     * 
     * @throws Exception
     */
    @Test
    public void anyExampleChecksThatClassIsOfSameType() throws Exception {
        assertThat("Hello", is(any(String.class)));
    }
    
    /**
     * any example shows string is also an object
     * 
     * @throws Exception
     */
    @Test
    public void anyExampleShowsStringIsAlsoAnObject() throws Exception {
        assertThat("Hello", is(any(Object.class)));
    }
    
    /**
     * anyOf example failing if all matchers are false
     * 
     * @throws Exception
     */
    @Test
    public void anyOfExampleFailingIfAllMatchersAreFalse() throws Exception {
        assertThat("Hello", is(not(anyOf(nullValue(), instanceOf(Integer.class), equalTo("Goodbye")))));
    }
    
    /**
     * anyOf example returns true if one matches
     * 
     * @throws Exception
     */
    @Test
    public void anyOfExampleReturnsTrueIfOneMatches() throws Exception {
        assertThat("Hello", is(anyOf(nullValue(), instanceOf(String.class), equalTo("Goodbye"))));
    }
    
    /**
     * anything example always returns true
     * 
     * @throws Exception
     */
    @Test
    public void anythingExampleAlwaysReturnsTrue() throws Exception {
        assertThat("Hello", is(anything()));
    }
    
    /**
     * Feels very esoteric and not for typical usage used to override the
     * description.
     * 
     * @throws Exception
     */
    @Test
    public void describedAsExample() throws Exception {
        Matcher<?> matcher = describedAs("My Description", anything());
        Description description = new StringDescription().appendDescriptionOf(matcher);
        assertThat("My Description", is(description.toString()));
    }
    
    /**
     * equalTo example adding two plus two
     * 
     * @throws Exception
     */
    @Test
    public void equalToExampleAddingTwoPlusTwo() throws Exception {
        assertThat(2 + 2, is(equalTo(4)));
    }
    
    /**
     * instanceOf example for string
     * 
     * @throws Exception
     */
    @Test
    public void instanceOfExampleForString() throws Exception {
        assertThat("Hello", is(instanceOf(String.class)));
    }
    
    /**
     * is example shortcut as just syntactic sugar used three times
     * 
     * @throws Exception
     */
    @Test
    public void isExampleShortCutAsJustSyntacticSugarUsedThreeTimes() throws Exception {
        assertThat("Hello", is(is(is(notNullValue()))));
    }
    
    /**
     * is example shortcut for isEqualTo
     * 
     * @throws Exception
     */
    @Test
    public void isExampleShortCutForIsEqualTo() throws Exception {
        assertThat("Hello", is("Hello"));
        assertThat("Hello", equalTo("Hello"));
    }
    
    /**
     * is example shortcut for isInstanceOf class
     * 
     * @throws Exception
     */
    @Test
    public void isExampleShortCutForIsInstanceOfClass() throws Exception {
        assertThat("Hello", is(String.class));
        assertThat("Hello", instanceOf(String.class));
    }
    
    /**
     * not example just inverts expression
     * 
     * @throws Exception
     */
    @Test
    public void notExampleJustInvertsExpression() throws Exception {
        assertThat("Hello", is(not(instanceOf(Integer.class))));
    }
    
    /**
     * notNullValue example for a class
     * 
     * @throws Exception
     */
    @Test
    public void notNullValueExampleForAClass() throws Exception {
        assertThat("Hello", is(notNullValue(Object.class)));
    }
    
    /**
     * notNullValue example for string
     * 
     * @throws Exception
     */
    @Test
    public void notNullValueExampleForString() throws Exception {
        assertThat("Hello", is(notNullValue()));
    }
    
    /**
     * nullValue example with a null
     * 
     * @throws Exception
     */
    @Test
    public void nullValueExampleWithANull() throws Exception {
        assertThat(null, is(nullValue()));
    }
    
    /**
     * nullValue example with a null type
     * 
     * @throws Exception
     */
    @Test
    public void nullValueExampleWithANullType() throws Exception {
        Integer nothing = null;
        assertThat(nothing, is(nullValue(Integer.class)));
    }
    
    /**
     * sameInstance example
     * 
     * @throws Exception
     */
    @Test
    public void sameInstanceExample() throws Exception {
        Object object = new Object();
        Object sameObject = object;
        assertThat(object, is(sameInstance(sameObject)));
    }
}
