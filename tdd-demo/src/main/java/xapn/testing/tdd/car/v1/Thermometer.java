/**
 * 
 */
package xapn.testing.tdd.car.v1;

/**
 * Thermometer
 * 
 * @author Xavier Pigeon
 */
public class Thermometer {
    
    private int temperature;
    
    /**
     * Default constructor
     */
    public Thermometer() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code temperature}
     * 
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }
    
    /**
     * Setter for the field {@code temperature}
     * 
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
