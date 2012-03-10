/**
 * 
 */
package xapn.testing.unitils.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.inject.annotation.TestedObject;

import xapn.testing.unitils.Foo;

/**
 * Test Case for {@link xapn.testing.unitils.Foo}
 * 
 * @author Xavier Pigeon
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
public class FooTest {
    
    @TestedObject
    private Foo foo;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {}
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    /**
     * Test method.
     */
    @Test
    public void testFooInstance() {
        Assert.assertNotNull(foo);
    }
}
