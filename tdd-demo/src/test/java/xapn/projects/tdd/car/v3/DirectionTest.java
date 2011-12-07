/**
 * 
 */
package xapn.projects.tdd.car.v3;

import static junit.framework.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test Case for {@link xapn.projects.tdd.car.v3.Direction}
 * 
 * @author Xavier Pigeon
 */
public class DirectionTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectionTest.class);
    
    /** Object under test */
    private Direction direction;
    
    /**
     * Set up
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        direction = new Direction();
    }
    
    /**
     * Tear down
     * 
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    /**
     * Test method for
     * {@link xapn.projects.tdd.car.v3.Direction#getLeftDirection()}.
     */
    @Test
    public void testGetLeftDirection() {
        LOGGER.debug("TEST: testGetLeftDirection");
        
        direction.change(0, 1);
        assertEquals(new Direction(-1, 1), direction.getLeftDirection());
        
        direction.change(-1, 1);
        assertEquals(new Direction(-1, 0), direction.getLeftDirection());
        
        direction.change(-1, 0);
        assertEquals(new Direction(-1, -1), direction.getLeftDirection());
        
        direction.change(-1, -1);
        assertEquals(new Direction(0, -1), direction.getLeftDirection());
        
        direction.change(0, -1);
        assertEquals(new Direction(1, -1), direction.getLeftDirection());
        
        direction.change(1, -1);
        assertEquals(new Direction(1, 0), direction.getLeftDirection());
        
        direction.change(1, 0);
        assertEquals(new Direction(1, 1), direction.getLeftDirection());
        
        direction.change(1, 1);
        assertEquals(new Direction(0, 1), direction.getLeftDirection());
    }
    
    /**
     * Test method for
     * {@link xapn.projects.tdd.car.v3.Direction#getOppositeDirection()}.
     */
    @Test
    public void testGetOppositeDirection() {
        LOGGER.debug("TEST: testGetOppositeDirection");
        
        direction.change(1, 2);
        assertEquals(new Direction(-1, -2), direction.getOppositeDirection());
        
        direction.change(-1, 2);
        assertEquals(new Direction(1, -2), direction.getOppositeDirection());
        
        direction.change(1, -2);
        assertEquals(new Direction(-1, 2), direction.getOppositeDirection());
        
        direction.change(-1, -2);
        assertEquals(new Direction(1, 2), direction.getOppositeDirection());
    }
    
    /**
     * Test method for
     * {@link xapn.projects.tdd.car.v2.Direction#getRightDirection()}.
     */
    @Test
    public void testGetRightDirection() {
        LOGGER.debug("TEST: testGetRightDirection");
        
        direction.change(0, 1);
        assertEquals(new Direction(1, 1), direction.getRightDirection());
        
        direction.change(1, 1);
        assertEquals(new Direction(1, 0), direction.getRightDirection());
        
        direction.change(1, 0);
        assertEquals(new Direction(1, -1), direction.getRightDirection());
        
        direction.change(1, -1);
        assertEquals(new Direction(0, -1), direction.getRightDirection());
        
        direction.change(0, -1);
        assertEquals(new Direction(-1, -1), direction.getRightDirection());
        
        direction.change(-1, -1);
        assertEquals(new Direction(-1, 0), direction.getRightDirection());
        
        direction.change(-1, 0);
        assertEquals(new Direction(-1, 1), direction.getRightDirection());
        
        direction.change(-1, 1);
        assertEquals(new Direction(0, 1), direction.getRightDirection());
    }
}
