package xapn.projects.tdd.car.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wheel
 * 
 * @author Xavier Pigeon
 */
public class Wheel {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Wheel.class);
    
    private int angle;
    
    /**
     * Default constructor
     */
    public Wheel() {
        setAngle(0);
    }
    
    /**
     * Getter for the field {@code angle}
     * 
     * @return the angle
     */
    public int getAngle() {
        return angle;
    }
    
    /**
     * Keep the wheel in the same direction
     */
    public void goStraightOn() {
        setAngle(0);
        LOGGER.debug("Wheel to go straight on");
    }
    
    /**
     * Setter for the field {@code angle}
     * 
     * @param angle the angle to set
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }
    
    /**
     * Turn the wheel at 180°
     */
    public void turnAround() {
        setAngle(180);
        LOGGER.debug("Wheel to turn around");
    }
    
    /**
     * Turn the wheel on the left (-45°)
     */
    public void turnLeft() {
        setAngle(angle - 45);
        LOGGER.debug("Wheel on the left");
    }
    
    /**
     * Turn the wheel on the right (+45°)
     */
    public void turnRight() {
        setAngle(angle + 45);
        LOGGER.debug("Wheel on the right");
    }
}
