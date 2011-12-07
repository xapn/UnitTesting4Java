package xapn.projects.tdd.car.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Engine
 * 
 * @author Xavier Pigeon
 */
public class Engine {
    
    private static final int DEFAULT_SPEED = 0;
    private static final Logger LOGGER = LoggerFactory.getLogger(Engine.class);
    
    private int speed = 0;
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public Engine() {
        throw new RuntimeException("Not yet implemented");
        // turnedOn = false;
        // speed = DEFAULT_SPEED;
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
        // speed -= delta;
    }
    
    /**
     * Speed up
     * 
     * @param delta the speed difference
     */
    public void speedUp(int delta) {
        throw new RuntimeException("Not yet implemented");
        // speed += delta;
    }
    
    /**
     * Start the engine
     */
    public void start() {
        throw new RuntimeException("Not yet implemented");
        // turnedOn = true;
        // speed = DEFAULT_SPEED;
        // LOGGER.debug("Engine started");
    }
    
    /**
     * Stop the engine
     */
    public void stop() {
        throw new RuntimeException("Not yet implemented");
        // turnedOn = false;
        // speed = DEFAULT_SPEED;
        // LOGGER.debug("Engine stopped");
    }
}
