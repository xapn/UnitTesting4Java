/**
 * 
 */
package xapn.testing.tdd.car.v1;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xapn.testing.tdd.car.v1.GlobalPositioningSystem;
import xapn.testing.tdd.car.v1.IRoadMap;
import xapn.testing.tdd.car.v1.Position;

/**
 * Test Case for {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem}
 * 
 * @author Xavier Pigeon
 */
public class GlobalPositioningSystemTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalPositioningSystem.class);
    
    /** Object under test */
    private GlobalPositioningSystem gps;
    
    /**
     * Set up
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        gps = new GlobalPositioningSystem();
        gps.getCurrentPosition().change(0, 0);
        
        IRoadMap carteMock = EasyMock.createMock(IRoadMap.class);
        EasyMock.expect(carteMock.indicateBarrier((Position) EasyMock.anyObject())).andReturn(false).anyTimes();
        gps.setRoadMap(carteMock);
        EasyMock.replay(carteMock);
    }
    
    /**
     * Tear down
     * 
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    /**
     * Bug to resolve:</br> Movement in progress: Position [x=-6, y=-2] to
     * Position [x=5, y=7] | Direction [directionX=1, directionY=0]</br>
     * Position [x=3, y=7] => Position [x=4, y=8] | Direction [directionX=1,
     * directionY=1]
     */
    @Test()
    public void testBug() {
        LOGGER.debug("TEST testBug");
        
        gps.getCurrentPosition().change(3, 7);
        gps.getDestination().change(5, 7);
        gps.getDirection().change(1, 1);
        assertFalse(gps.goStraightOn());
        assertTrue(gps.turnRight());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#goStraightOn()} .
     */
    @Test
    public void testGoStraightOn() {
        LOGGER.debug("TEST testGoStraightOn");
        
        gps.getCurrentPosition().change(1, 2);
        gps.getDestination().change(3, 5);
        
        gps.getDirection().change(1, 1);
        assertTrue(gps.goStraightOn());
        
        gps.getDirection().change(0, 1);
        assertFalse(gps.goStraightOn());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnAround()}.
     */
    @Test
    public void testTurnAround() {
        LOGGER.debug("TEST testTurnAround");
        
        gps.getCurrentPosition().change(2, 2);
        gps.getDirection().change(1, 1);
        gps.getDestination().change(-5, -5);
        assertTrue(gps.turnAround());
        
        gps.getCurrentPosition().change(2, 2);
        gps.getDirection().change(1, 1);
        gps.getDestination().change(-5, -5);
        assertTrue(gps.turnAround());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnLeft()}.
     */
    @Test
    public void testTurnLeft() {
        LOGGER.debug("TEST testTurnLeft");
        
        gps.getDestination().change(-3, 3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.turnLeft());
        
        gps.getDestination().change(3, 3);
        gps.getDirection().change(0, 1);
        assertFalse(gps.turnLeft());
        
        gps.getDestination().change(3, -3);
        gps.getDirection().change(-1, 0);
        assertTrue(gps.turnLeft());
        
        gps.getDestination().change(0, -3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.turnLeft());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnRight()}.
     */
    @Test
    public void testTurnRight() {
        LOGGER.debug("TEST testTurnRight");
        
        gps.getDestination().change(3, 3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.turnRight());
        
        gps.getDestination().change(-3, 3);
        gps.getDirection().change(0, 1);
        assertFalse(gps.turnRight());
        
        gps.getDestination().change(-3, -3);
        gps.getDirection().change(1, 0);
        assertTrue(gps.turnRight());
        
        gps.getDestination().change(0, -3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.turnRight());
    }
}
