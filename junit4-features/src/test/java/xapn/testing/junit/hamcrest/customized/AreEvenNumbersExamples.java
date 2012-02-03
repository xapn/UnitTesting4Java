/**
 * 
 */
package xapn.testing.junit.hamcrest.customized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static xapn.testing.junit.hamcrest.customized.AreEvenNumbers.evenNumbers;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Examples of using the
 * {@link xapn.testing.junit.hamcrest.customized.AreEvenNumbers} matcher.
 * 
 * @author Xavier Pigeon
 */
public class AreEvenNumbersExamples {
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {}
    
    /**
     * Example of using the evenNumbers matcher
     */
    @Test
    public void shouldHaveOnlyEvenNumbers() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        assertThat(numbers, is(evenNumbers()));
    }
    
    /**
     * Example of using the evenNumbers matcher
     */
    @Test
    public void shouldNotHaveOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 8, 10);
        assertThat(numbers, not(evenNumbers()));
    }
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
}
