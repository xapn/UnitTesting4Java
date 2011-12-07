package xapn.testing.tdd.car.v1;

/**
 * Engine
 * 
 * @author Xavier Pigeon
 */
public class Engine {
    
    private int speed = 0;
    private boolean turnedOn = false;
    
    /**
     * Default constructor
     */
    public Engine() {
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
     * Getter for the field {@code turnedOn}
     * 
     * @return the turnedOn
     */
    public boolean isTurnedOn() {
        return turnedOn;
    }
    
    /**
     * Setter for the field {@code speed}
     * 
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
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
     * Speed down
     * 
     * @param delta the speed difference
     */
    public void speedDown(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Speed up
     * 
     * @param delta the speed difference
     */
    public void speedUp(int delta) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Start the engine
     */
    public void start() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Stop the engine
     */
    public void stop() {
        throw new RuntimeException("Not yet implemented");
    }
}
