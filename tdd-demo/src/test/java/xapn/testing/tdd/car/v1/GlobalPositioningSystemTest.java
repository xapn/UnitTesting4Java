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
        LOGGER.debug("TEST: testBug");
        
        gps.getCurrentPosition().change(3, 7);
        gps.getDestination().change(5, 7);
        gps.getDirection().change(1, 1);
        assertFalse(gps.mustGoStraightOn());
        assertTrue(gps.mustTurnRight());
    }
    
    /**
     * Test method for
     * <<<<<<< HEAD:tdd-demo/src/test/java/xapn/testing/tdd/car/v1/
     * GlobalPositioningSystemTest.java
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#goStraightOn()} .
     * =======
     * {@link xapn.projects.tdd.car.v1.GlobalPositioningSystem#mustGoStraightOn()}
     * .
     * >>>>>>> e681a5c... Issue #8 - TDD
     * Demonstration.:tdd-demo/src/test/java/xapn
     * /projects/tdd/car/v1/GlobalPositioningSystemTest.java
     */
    @Test
    public void testMustGoStraightOn() {
        LOGGER.debug("TEST: testMustGoStraightOn");
        
        gps.getCurrentPosition().change(1, 2);
        gps.getDestination().change(3, 5);
        
        gps.getDirection().change(1, 1);
        assertTrue(gps.mustGoStraightOn());
        
        gps.getDirection().change(0, 1);
        assertFalse(gps.mustGoStraightOn());
    }
    
    /**
     * Test method for
     * <<<<<<< HEAD:tdd-demo/src/test/java/xapn/testing/tdd/car/v1/
     * GlobalPositioningSystemTest.java
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnAround()}.
     * =======
     * {@link xapn.projects.tdd.car.v1.GlobalPositioningSystem#mustTurnAround()}
     * .
     * >>>>>>> e681a5c... Issue #8 - TDD
     * Demonstration.:tdd-demo/src/test/java/xapn
     * /projects/tdd/car/v1/GlobalPositioningSystemTest.java
     */
    @Test
    public void testMustTurnAround() {
        LOGGER.debug("TEST: testMustTurnAround");
        
        gps.getCurrentPosition().change(2, 2);
        gps.getDirection().change(1, 1);
        gps.getDestination().change(-5, -5);
        assertTrue(gps.mustTurnAround());
        
        gps.getCurrentPosition().change(2, 2);
        gps.getDirection().change(1, 1);
        gps.getDestination().change(-5, -5);
        assertTrue(gps.mustTurnAround());
    }
    
    /**
     * Test method for
     * <<<<<<< HEAD:tdd-demo/src/test/java/xapn/testing/tdd/car/v1/
     * GlobalPositioningSystemTest.java
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnLeft()}.
     * =======
     * {@link xapn.projects.tdd.car.v1.GlobalPositioningSystem#mustTurnLeft()}.
     * >>>>>>> e681a5c... Issue #8 - TDD
     * Demonstration.:tdd-demo/src/test/java/xapn
     * /projects/tdd/car/v1/GlobalPositioningSystemTest.java
     */
    @Test
    public void testMustTurnLeft() {
        LOGGER.debug("TEST: testMustTurnLeft");
        
        gps.getDestination().change(-3, 3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.mustTurnLeft());
        
        gps.getDestination().change(3, 3);
        gps.getDirection().change(0, 1);
        assertFalse(gps.mustTurnLeft());
        
        gps.getDestination().change(3, -3);
        gps.getDirection().change(-1, 0);
        assertTrue(gps.mustTurnLeft());
        
        gps.getDestination().change(0, -3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.mustTurnLeft());
    }
    
    /**
     * Test method for
     * <<<<<<< HEAD:tdd-demo/src/test/java/xapn/testing/tdd/car/v1/
     * GlobalPositioningSystemTest.java
     * {@link xapn.testing.tdd.car.v1.GlobalPositioningSystem#turnRight()}.
     * =======
     * {@link xapn.projects.tdd.car.v1.GlobalPositioningSystem#mustTurnRight()}.
     * >>>>>>> e681a5c... Issue #8 - TDD
     * Demonstration.:tdd-demo/src/test/java/xapn
     * /projects/tdd/car/v1/GlobalPositioningSystemTest.java
     */
    @Test
    public void testMustTurnRight() {
        LOGGER.debug("TEST: testMustTurnRight");
        
        gps.getDestination().change(3, 3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.mustTurnRight());
        
        gps.getDestination().change(-3, 3);
        gps.getDirection().change(0, 1);
        assertFalse(gps.mustTurnRight());
        
        gps.getDestination().change(-3, -3);
        gps.getDirection().change(1, 0);
        assertTrue(gps.mustTurnRight());
        
        gps.getDestination().change(0, -3);
        gps.getDirection().change(0, 1);
        assertTrue(gps.mustTurnRight());
    }
}
