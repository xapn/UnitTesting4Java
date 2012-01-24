package xapn.testing.junit.parameterizedtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * More interesting parameterized test
 * One parameter for an input datum and one parameter for the expected result.
 * 
 * @author Xavier Pigeon
 */
@RunWith(Parameterized.class)
public class MoreInterestingParameterizedTest {
    
    @Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][] { { "aBcDe", "eDcBa" }, { "654321", "123456" }, { ",;:!", "!:;," } });
    }
    
    // Tested object
    private Reverser reverser;
    // Parameters
    private String datum;
    private String expectedResult;
    
    public MoreInterestingParameterizedTest(String datum, String expectedResult) {
        this.datum = datum;
        this.expectedResult = expectedResult;
    }
    
    @Before
    public void setUp() throws Exception {
        reverser = new Reverser();
    }
    
    @After
    public void tearDown() throws Exception {}
    
    @Test
    public void test() {
        String actualResult = reverser.reverse(datum);
        System.out.println("Datum: " + datum + " | Actual: " + actualResult + " | Expected: " + expectedResult);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
