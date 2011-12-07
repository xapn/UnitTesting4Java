/**
 * 
 */
package xapn.projects.tdd.car.v3;

/**
 * Thermometer
 * 
 * @author Xavier Pigeon
 */
public class Thermometer {
    
    private int temperature;
    
    /**
     * Default constructor
     * 
     * @param temperature
     */
    public Thermometer(int temperature) {
        this.temperature = temperature;
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
