/**
 * 
 */
package xapn.testing.tdd.car.v1;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xapn.testing.tdd.car.v1.AirConditioning;

/**
 * Test Case for {@link xapn.testing.tdd.car.v1.AirConditioning}
 * 
 * @author Xavier Pigeon
 */
public class AirConditioningTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AirConditioningTest.class);
    
    /** Object under test */
    private AirConditioning airConditioning;
    
    /**
     * Set up
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        airConditioning = new AirConditioning();
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
     * {@link xapn.testing.tdd.car.v1.AirConditioning#cool(int)}.
     */
    @Test
    public void testCool() {
        LOGGER.debug("TEST testCool");
        
        // Setup
        int currentTemperature = 35;
        airConditioning.getThermometer().setTemperature(currentTemperature);
        int requiredTemperature = 20;
        
        // Process
        airConditioning.cool(currentTemperature - requiredTemperature);
        
        // Verification
        assertEquals(requiredTemperature, airConditioning.getRequiredTemperature());
        assertEquals(requiredTemperature, airConditioning.getThermometer().getTemperature());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.AirConditioning#heat(int)}.
     */
    @Test
    public void testHeat() {
        LOGGER.debug("TEST testHeat");
        
        // Setup
        int currentTemperature = 10;
        airConditioning.getThermometer().setTemperature(currentTemperature);
        int requiredTemperature = 22;
        
        // Process
        airConditioning.heat(requiredTemperature - currentTemperature);
        
        // Verification
        assertEquals(requiredTemperature, airConditioning.getRequiredTemperature());
        assertEquals(requiredTemperature, airConditioning.getThermometer().getTemperature());
    }
    
    /**
     * Test method for
     * {@link xapn.testing.tdd.car.v1.AirConditioning#turnOff()} .
     */
    @Test
    public void testTurnOff() {
        LOGGER.debug("TEST testTurnOff");
        
        // Setup
        airConditioning.setAirConditioningOn(true);
        
        // Process
        airConditioning.turnOff();
        
        // Verification
        assertFalse(airConditioning.isAirConditioningOn());
    }
    
    /**
     * Test method for {@link xapn.testing.tdd.car.v1.AirConditioning#turnOn()}
     * .
     */
    @Test
    public void testTurnOn() {
        LOGGER.debug("TEST testTurnOn");
        
        // Setup
        // Nothing else to do
        
        // Process
        airConditioning.turnOn();
        
        // Verification
        assertTrue(airConditioning.isAirConditioningOn());
    }
}
