package xapn.testing.tdd.car.v1;

/**
 * Wheel
 * 
 * @author Xavier Pigeon
 */
public class Wheel {
    
    private int angle;
    
    /**
     * Default constructor
     */
    public Wheel() {
        throw new RuntimeException("Not yet implemented");
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
     * Setter for the field {@code angle}
     * 
     * @param angle the angle to set
     */
    public void setAngle(int angle) {
        this.angle = angle % 360;
    }
}
