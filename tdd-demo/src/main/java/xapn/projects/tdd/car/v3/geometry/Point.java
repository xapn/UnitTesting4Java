/**
 * 
 */
package xapn.projects.tdd.car.v3.geometry;

/**
 * Point
 * 
 * @author Xavier Pigeon
 */
public class Point {
    
    private int x;
    private int y;
    
    /**
     * Default constructor
     */
    public Point() {
        x = y = 0;
    }
    
    /**
     * Constructor
     * 
     * @param x the x axis coordinate
     * @param y the y axis coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof Point) {
            Point other = (Point) obj;
            
            if (this.x == other.x && this.y == other.y) {
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
    
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
