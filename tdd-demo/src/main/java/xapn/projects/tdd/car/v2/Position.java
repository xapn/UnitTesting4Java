/**
 * 
 */
package xapn.projects.tdd.car.v2;

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
        // x = y = 0;
    }
    
    /**
     * Constructor
     * 
     * @param x the x axis position value
     * @param y the y axis position value
     */
    public Position(int x, int y) {
        throw new RuntimeException("Not yet implemented");
        // this.x = x;
        // this.y = y;
    }
    
    /**
     * Constructor
     * 
     * @param origin the origin position
     * @param direction the direction
     */
    public Position(Position origin, Direction direction) {
        throw new RuntimeException("Not yet implemented");
        // this(origin.getX() + direction.getDirectionX(), origin.getY() +
        // direction.getDirectionY());
    }
    
    /**
     * Apply a given direction
     * 
     * @param direction the direction to apply
     */
    public void applyDirection(Direction direction) {
        throw new RuntimeException("Not yet implemented");
        // this.x += direction.getDirectionX();
        // this.y += direction.getDirectionY();
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
     * Change the position
     * 
     * @param position the new position
     */
    public void change(Position position) {
        this.x = position.getX();
        this.y = position.getY();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof Position) {
            Position other = (Position) obj;
            
            if (this.x == other.getX() && this.y == other.getY()) {
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
        return "Position [x=" + x + ", y=" + y + "]";
    }
}
