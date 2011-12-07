/**
 * 
 */
package xapn.testing.tdd.car.v1;

/**
 * Position
 * 
 * @author Xavier Pigeon
 */
public class Position {
    
    private int x;
    private int y;
    
    /**
     * Default constructor
     */
    public Position() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Constructor
     * 
     * @param x the x axis position value
     * @param y the y axis position value
     */
    public Position(int x, int y) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Change the position values
     * 
     * @param x the x axis position value
     * @param y the y axis position value
     */
    public void change(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Getter for the field {@code x}
     * 
     * @return the x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Getter for the field {@code y}
     * 
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Setter for the field {@code x}
     * 
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Setter for the field {@code y}
     * 
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
