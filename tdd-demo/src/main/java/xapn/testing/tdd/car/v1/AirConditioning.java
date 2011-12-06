package xapn.testing.tdd.car.v1;

/**
 * Air Conditioning
 * 
 * @author Xavier Pigeon
 */
public class AirConditioning {
    
    private boolean airConditioningOn;
    private int requiredTemperature;
    private Thermometer thermometer;
    
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
     * Heat the air
     * 
     * @param delta the temperature difference
     */
    public void heat(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code airConditioningOn}
     * 
     * @return the airConditioningOn
     */
    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }
    
    /**
     * Setter for the field {@code airConditioningOn}
     * 
     * @param airConditioningOn the airConditioningOn to set
     */
    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
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
