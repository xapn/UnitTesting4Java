package xapn.testing.tdd.car.v1;

/**
 * Engine
 * 
 * @author Xavier Pigeon
 */
public class Engine {
    
    private boolean on = false;
    private int speed = 0;
    
    /**
     * Default constructor
     */
    public Engine() {
        throw new RuntimeException("Not yet implemented");
    }
    
    public void speedUp(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    public void stop() {
        throw new RuntimeException("Not yet implemented");
    }
    
    public void start() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code speed}
     * 
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Getter for the field {@code on}
     * 
     * @return the on
     */
    public boolean isOn() {
        return on;
    }
    
    public void speedDown(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Setter for the field {@code on}
     * 
     * @param on the on to set
     */
    public void setOn(boolean engineOn) {
        this.on = engineOn;
    }
    
    /**
     * Setter for the field {@code speed}
     * 
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
