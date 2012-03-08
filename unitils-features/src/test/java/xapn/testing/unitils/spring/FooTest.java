/**
 * 
 */
package xapn.testing.unitils.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * Test Case for {@link xapn.testing.unitils.spring.Foo}.
 * 
 * @author Xavier Pigeon
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
@SpringApplicationContext({ "spring-beans.xml" })
public class FooTest {
    
    @SpringBeanByType
    private Foo aFoo;
    
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
     * Test method for {@link xapn.testing.unitils.spring.Foo#doFooThing()}.
     */
    @Test
    public void testDoFooThing() {
        aFoo.doFooThing();
    }
}
