/**
 * 
 */
package xapn.testing.tdd.car.v1;

/**
 * Direction
 * 
 * @author Xavier Pigeon
 */
public class Direction {
    
    private int directionX;
    private int directionY;
    
    /**
     * Default constructor
     */
    public Direction() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Change the direction values
     * 
     * @param directionX the x axis direction value
     * @param directionY the y axis direction value
     */
    public void change(int directionX, int directionY) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof Direction) {
            Direction other = (Direction) obj;
            
            if (directionX == other.getDirectionX() && directionY == other.getDirectionY()) {
                equality = true;
            }
        }
        
        return equality;
    }
    
    /**
     * Getter of the field {@code directionX}
     * 
     * @return the directionX
     */
    public int getDirectionX() {
        return directionX;
    }
    
    /**
     * Getter of the field {@code directionY}
     * 
     * @return the directionY
     */
    public int getDirectionY() {
        return directionY;
    }
    
    /**
     * Give the direction on the left
     * 
     * @return the direction on the left
     */
    public Direction getLeft() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give the opposite direction
     * 
     * @return the opposite direction
     */
    public Direction getOppositeDirection() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give the direction on the right
     * 
     * @return the direction on the right
     */
    public Direction getRight() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Setter of the field {@code directionX}
     * 
     * @param directionX the directionX to set
     */
    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }
    
    /**
     * Setter of the field {@code directionY}
     * 
     * @param directionY the directionY to set
     */
    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Direction [directionX=" + directionX + ", directionY=" + directionY + "]";
    }
}
