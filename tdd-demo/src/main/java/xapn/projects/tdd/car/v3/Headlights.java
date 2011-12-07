/**
 * 
 */
package xapn.projects.tdd.car.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Headlights
 * 
 * @author Xavier Pigeon
 */
public class Headlights {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Headlights.class);
    
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public Headlights() {
        turnedOn = false;
    }
    
    /**
     * Getter for the field {@code turnedOn}
     * 
     * @return the turnedOn
     */
    public boolean isTurnedOn() {
        return turnedOn;
    }
    
    /**
     * Setter for the field {@code turnedOn}
     * 
     * @param turnedOn the turnedOn to set
     */
    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
    
    /**
     * Turn off
     */
    public void turnOff() {
        setTurnedOn(false);
        LOGGER.debug("Headlights turned off");
    }
    
    /**
     * Turn on
     */
    public void turnOn() {
        setTurnedOn(true);
        LOGGER.debug("Headlights turned on");
    }
}
