/**
 * 
 */
package xapn.projects.tdd.car.v3;

import xapn.projects.tdd.car.v3.geometry.Point;

/**
 * Position
 * 
 * @author Xavier Pigeon
 */
public class Position {
    
    private Point point;
    
    /**
     * Default constructor
     */
    public Position() {
        point = new Point(0, 0);
    }
    
    /**
     * Constructor
     * 
     * @param x the x axis position value
     * @param y the y axis position value
     */
    public Position(int x, int y) {
        point = new Point(x, y);
    }
    
    /**
     * Constructor
     * 
     * @param origin the origin position
     * @param direction the direction
     */
    public Position(Position origin, Direction direction) {
        this(origin.getX() + direction.getDirectionX(), origin.getY() + direction.getDirectionY());
    }
    
    /**
     * Apply a given direction
     * 
     * @param direction the direction to apply
     */
    public void applyDirection(Direction direction) {
        setX(point.getX() + direction.getDirectionX());
        setY(point.getY() + direction.getDirectionY());
    }
    
    /**
     * Change the position values
     * 
     * @param x the x axis position value
     * @param y the y axis position value
     */
    public void change(int x, int y) {
        point.setX(x);
        point.setY(y);
    }
    
    /**
     * Change the position
     * 
     * @param position the new position
     */
    public void change(Position position) {
        point.setX(position.getX());
        point.setY(position.getY());
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof Position) {
            Position other = (Position) obj;
            
            if ((point != null && point.equals(other.getPoint())) || (point == null && other.getPoint() == null)) {
                equality = true;
            }
        }
        
        return equality;
    }
    
    /**
     * Getter for the field {@code point}
     * 
     * @return the point
     */
    public Point getPoint() {
        return point;
    }
    
    /**
     * Get the x axis position value
     * 
     * @return the x
     */
    public int getX() {
        return point.getX();
    }
    
    /**
     * Get the y axis position value
     * 
     * @return the y
     */
    public int getY() {
        return point.getY();
    }
    
    /**
     * Setter for the field {@code point}
     * 
     * @param point the point to set
     */
    public void setPoint(Point point) {
        this.point = point;
    }
    
    /**
     * Set the x avis position value
     * 
     * @param x the x to set
     */
    public void setX(int x) {
        this.point.setX(x);
    }
    
    /**
     * Set the y axis position value
     * 
     * @param y the y to set
     */
    public void setY(int y) {
        point.setY(y);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Position [x=" + point.getX() + ", y=" + point.getY() + "]";
    }
}
