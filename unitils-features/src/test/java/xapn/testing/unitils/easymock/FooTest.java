/**
 * 
 */
package xapn.testing.unitils.easymock;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.easymock.EasyMockUnitils;
import org.unitils.easymock.annotation.Mock;
import org.unitils.inject.annotation.InjectIntoByType;
import org.unitils.inject.annotation.TestedObject;

import xapn.testing.unitils.Bar;
import xapn.testing.unitils.Foo;

/**
 * Test Case for {@link xapn.projects.unitils.Foo}
 * 
 * @author Xavier Pigeon
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
public class FooTest {
    
    @Mock
    @InjectIntoByType
    private Bar barMock;
    
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
     * Test method for {@link xapn.projects.unitils.Foo#doFooThing()}.
     */
    @Test
    public void testDoFooThing() {
        // Setup
        EasyMock.expect(barMock.doBarThing()).andReturn("barMock").once();
        EasyMockUnitils.replay();
        
        // Process
        foo.doFooThing();
        
        // Verification
        EasyMockUnitils.verify();
    }
}
