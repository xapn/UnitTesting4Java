package xapn.projects.tdd.car.v2;

/**
 * Air Conditioning
 * 
 * @author Xavier Pigeon
 */
public class AirConditioning {
    
    private static final int DEFAULT_TEMPERATURE = 20;
    private int requiredTemperature;
    private final Thermometer thermometer;
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public AirConditioning() {
        throw new RuntimeException("Not yet implemented");
        // turnedOn = false;
        // thermometer = new Thermometer(DEFAULT_TEMPERATURE);
        // requiredTemperature = thermometer.getTemperature();
    }
    
    /**
     * Cool air
     * 
     * @param delta the temperature difference
     */
    public void cool(int delta) {
        throw new RuntimeException("Not yet implemented");
        // requiredTemperature = thermometer.getTemperature() - delta;
        // updateTemperature();
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
        // requiredTemperature = thermometer.getTemperature() + delta;
        // updateTemperature();
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
        // turnedOn = false;
    }
    
    /**
     * Turn on the air conditioning
     */
    public void turnOn() {
        throw new RuntimeException("Not yet implemented");
        // turnedOn = true;
    }
    
    /**
     * Update the temperature
     */
    private void updateTemperature() {
        throw new RuntimeException("Not yet implemented");
        // thermometer.setTemperature(requiredTemperature);
    }
}
