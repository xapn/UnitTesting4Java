/**
 * 
 */
package xapn.testing.unitils.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;
import org.unitils.spring.annotation.SpringBeanByName;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * Injection of Spring beans in unit tests.
 * 
 * @author Xavier Pigeon
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
@SpringApplicationContext("spring-beans.xml")
public class SpringBeanInjectionTest {
    
    @SpringBeanByType
    private Foo aFoo;
    
    @SpringBean("myBaz")
    private Baz aBaz;
    
    @SpringBeanByName
    private Qux myQux;
    
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
     * Test method
     */
    @Test
    public void test() {
        assertNotNull(aFoo);
        assertNotNull(aFoo.getBar());
        assertNotNull(aBaz);
        assertNotNull(myQux);
    }
}
