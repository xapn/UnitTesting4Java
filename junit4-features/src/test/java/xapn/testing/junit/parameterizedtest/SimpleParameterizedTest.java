/**
 * 
 */
package xapn.testing.junit.parameterizedtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * To mark a test class as a parameterized test, you must first annotate it with
 * {@code @RunWith(Parameterized.class)}. The class must then provide at least
 * three entities:
 * 1. A static method that generates and returns test data,
 * 2. A single constructor that stores the test data, and
 * 3. A test.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Parameterized.class)
public class SimpleParameterizedTest {
    
    /**
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays. For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][] { { 11 }, { 22 }, { 33 } });
    }
    
    // Field
    private int number;
    
    /**
     * Constructor
     * The JUnit test runner will instantiate this class once for every
     * element in the Collection returned by the method annotated with
     * 
     * @param number the number provided by the data-generating method
     */
    public SimpleParameterizedTest(int number) {
        this.number = number;
    }
    
    /**
     * Test method
     * Each test method is decorated with @Test (as usual).
     * This test method is run once for each element in the Collection returned
     * by the test data generator -- that is, every time this class is
     * instantiated. Each time this class is instantiated, it will have a
     * different data set, which is available to the test method through the
     * instance's fields.
     */
    @Test
    public void testWithParameters() {
        System.out.println("Number value = " + number);
    }
}
