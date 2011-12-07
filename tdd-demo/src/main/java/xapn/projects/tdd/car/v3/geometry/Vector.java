/**
 * 
 */
package xapn.projects.tdd.car.v3.geometry;

/**
 * Vector
 * 
 * @author Xavier Pigeon
 */
public class Vector {
    
    private static final int DEFAULT_X_VALUE = 0;
    private static final int DEFAULT_Y_VALUE = 0;
    
    private int x;
    private int y;
    
    /**
     * Default constructor
     */
    public Vector() {
        setX(DEFAULT_X_VALUE);
        setY(DEFAULT_Y_VALUE);
    }
    
    /**
     * Constructor
     * 
     * @param x the x axis component
     * @param y the y axis component
     */
    public Vector(int x, int y) {
        setX(x);
        setY(y);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof Vector) {
            Vector other = (Vector) obj;
            
            if (x == other.getX() && y == other.getY()) {
                equality = true;
            }
        }
        
        return equality;
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
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Vector [x=" + x + ", y=" + y + "]";
    }
}
