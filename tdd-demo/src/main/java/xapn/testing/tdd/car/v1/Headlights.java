/**
 * 
 */
package xapn.testing.tdd.car.v1;

/**
 * Headlights
 * 
 * @author Xavier Pigeon
 */
public class Headlights {
    
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public Headlights() {
        throw new RuntimeException("Not yet implemented");
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
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Turn on
     */
    public void turnOn() {
        throw new RuntimeException("Not yet implemented");
    }
}
