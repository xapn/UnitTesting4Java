/**
 * 
 */
package xapn.projects.tdd.car.v2;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test Case for {@link xapn.projects.tdd.car.v2.Car}
 * 
 * @author Xavier Pigeon
 */
public class CarTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarTest.class);
    
    /** Object under test */
    private Car car;
    
    /** Fixtures */
    private IRoadMap roadMapMock;
    
    /**
     * Set up
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        car = new Car();
        
        roadMapMock = EasyMock.createMock(IRoadMap.class);
        EasyMock.expect(roadMapMock.indicateBarrier((Position) EasyMock.anyObject())).andReturn(false).anyTimes();
        car.getGps().setRoadMap(roadMapMock);
        EasyMock.replay(roadMapMock);
    }
    
    /**
     * Tear down
     * 
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {}
    
    /**
     * Test method for {@link xapn.projects.tdd.car.v2.Car#coolInterior(int)}.
     */
    @Test
    public void testCoolInterior() {
        LOGGER.debug("TEST: testCoolInterior");
        
        // Setup
        int currentTemperature = 35;
        car.getAirConditioning().getThermometer().setTemperature(currentTemperature);
        int requiredTemperature = 20;
        
        // Process
        car.coolInterior(currentTemperature - requiredTemperature);
        
        // Verification
        assertTrue(car.getAirConditioning().isTurnedOn());
        // The air conditioning is working, so the windows must be closed.
        assertFalse(car.getElectricWindows().isOpen());
        // It was too hot, the interior is now at the correct temperature.
        assertEquals(requiredTemperature, car.getAirConditioning().getThermometer().getTemperature());
        
        EasyMock.verify(roadMapMock);
    }
    
    /**
     * Test method for {@link xapn.projects.tdd.car.v2.Car#heatInterior(int)}.
     */
    @Test
    public void testHeatInterior() {
        LOGGER.debug("TEST: testHeatInterior");
        
        // Setup
        int currentTemperature = -5;
        car.getAirConditioning().getThermometer().setTemperature(currentTemperature);
        int requiredTemperature = 20;
        
        // Process
        car.heatInterior(requiredTemperature - currentTemperature);
        
        // Verification
        assertTrue(car.getAirConditioning().isTurnedOn());
        // The air conditioning is on, so the windows must be closed.
        assertFalse(car.getElectricWindows().isOpen());
        // It was too cold, the interior is now at the correct temperature.
        assertEquals(requiredTemperature, car.getAirConditioning().getThermometer().getTemperature());
        
        EasyMock.verify(roadMapMock);
    }
    
    /**
     * Test method for
     * {@link xapn.projects.tdd.car.v2.Car#move(Position)}.
     */
    @Test(timeout = 100)
    public void testMove() {
        LOGGER.debug("TEST: testMove");
        
        // Setup
        car.getGps().setCurrentPosition(new Position(-6, -2));
        Position destination = new Position(5, 7);
        
        // Process
        car.move(destination);
        
        // Verification
        // The car reached the destination.
        assertEquals(destination, car.getGps().getCurrentPosition());
        // The car is stopped.
        assertEquals(0, car.getEngine().getSpeed());
        
        EasyMock.verify(roadMapMock);
    }
    
    /**
     * Test method for {@link xapn.projects.tdd.car.v2.Car#start()}.
     */
    @Test
    public void testStart() {
        LOGGER.debug("TEST: testStart");
        
        // Setup
        assertFalse(car.getEngine().isTurnedOn());
        
        // Process
        car.start();
        
        // Verification
        // To be safe, the doors must be closed automatically.
        assertFalse(car.getDoors().isOpen());
        // The engine must be on.
        assertTrue(car.getEngine().isTurnedOn());
        // The GPS must be working.
        assertTrue(car.getGps().isTurnedOn());
        
        EasyMock.verify(roadMapMock);
    }
    
    /**
     * Test method for {@link xapn.projects.tdd.car.v2.Car#stop()}.
     */
    @Test
    public void testStop() {
        LOGGER.debug("TEST: testStop");
        
        // Setup
        car.getEngine().setTurnedOn(true);
        car.getEngine().setSpeed(0);
        assertTrue(car.getEngine().isTurnedOn());
        
        // Process
        car.stop();
        
        // Verification
        // The engine must be stopped.
        assertFalse(car.getEngine().isTurnedOn());
        assertEquals(0, car.getEngine().getSpeed());
        // Headlights must be turned off to avoid draining the battery.
        assertFalse(car.getHeadlights().isTurnedOn());
        // The GPS must be turned off.
        assertFalse(car.getGps().isTurnedOn());
        
        EasyMock.verify(roadMapMock);
    }
}
