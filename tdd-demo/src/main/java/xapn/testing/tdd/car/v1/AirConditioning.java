package xapn.testing.tdd.car.v1;

/**
 * Air Conditioning
 * 
 * @author Xavier Pigeon
 */
public class AirConditioning {
    
    private int requiredTemperature;
    private Thermometer thermometer;
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public AirConditioning() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Cool the air
     * 
     * @param delta the temperature difference
     */
    public void cool(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code requiredTemperature}
     * 
     * @return the requiredTemperature
     */
    public int getRequiredTemperature() {
        return requiredTemperature;
    }
    
    /**
     * Getter for the field {@code thermometer}
     * 
     * @return the thermometer
     */
    public Thermometer getThermometer() {
        return thermometer;
    }
    
    /**
     * Heat air
     * 
     * @param delta the temperature difference
     */
    public void heat(int delta) {
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
     * Setter for the field {@code requiredTemperature}
     * 
     * @param requiredTemperature the requiredTemperature to set
     */
    public void setRequiredTemperature(int requiredTemperature) {
        this.requiredTemperature = requiredTemperature;
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
     * Turn off the air conditioning
     */
    public void turnOff() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Turn on the air conditioning
     */
    public void turnOn() {
        throw new RuntimeException("Not yet implemented");
    }
}
