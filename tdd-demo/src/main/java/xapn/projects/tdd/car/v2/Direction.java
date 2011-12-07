/**
 * 
 */
package xapn.projects.tdd.car.v2;

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
        // this.directionX = 0;
        // this.directionY = 0;
    }
    
    /**
     * Constructor
     * 
     * @param directionX the x axis direction value
     * @param directionY the y axis direction value
     */
    public Direction(int directionX, int directionY) {
        throw new RuntimeException("Not yet implemented");
        // this.directionX = directionX;
        // this.directionY = directionY;
    }
    
    /**
     * Constructor
     * 
     * @param origin the origin position
     * @param extremity the extremity position
     */
    public Direction(Position origin, Position extremity) {
        throw new RuntimeException("Not yet implemented");
        // this.directionX = extremity.getX() - origin.getX();
        // this.directionY = extremity.getY() - origin.getY();
    }
    
    /**
     * Calculate the norm of the vector
     * 
     * @return the norm
     */
    public float calculateNorm() {
        throw new RuntimeException("Not yet implemented");
        // return (float) Math.sqrt(getDirectionX() * getDirectionX() +
        // getDirectionY() * getDirectionY());
    }
    
    /**
     * Calculate a scalar product between two vectors
     * 
     * @param otherDirection an other direction
     * @return the scalar product
     */
    public float calculateScalarProduct(Direction otherDirection) {
        throw new RuntimeException("Not yet implemented");
        // return getDirectionX() * otherDirection.getDirectionX() +
        // getDirectionY() * otherDirection.getDirectionY();
    }
    
    /**
     * Change the direction values
     * 
     * @param direction the new direction
     */
    public void change(Direction direction) {
        setDirectionX(direction.getDirectionX());
        setDirectionY(direction.getDirectionY());
    }
    
    /**
     * Change the direction values
     * 
     * @param directionX the x axis direction value
     * @param directionY the y axis direction value
     */
    public void change(int directionX, int directionY) {
        setDirectionX(directionX);
        setDirectionY(directionY);
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
     * Get the direction on the left
     * 
     * @return the direction on the left
     */
    public Direction getLeftDirection() {
        throw new RuntimeException("Not yet implemented");
        // Direction direction = new Direction(getDirectionX(),
        // getDirectionY());
        //
        // if (getDirectionX() == 1 && getDirectionY() < 1) {
        // direction.setDirectionY(getDirectionY() + 1);
        // } else if (getDirectionX() == -1 && getDirectionY() > -1) {
        // direction.setDirectionY(getDirectionY() - 1);
        // } else if (getDirectionY() == 1 && getDirectionX() > -1) {
        // direction.setDirectionX(getDirectionX() - 1);
        // } else if (getDirectionY() == -1 && getDirectionX() < 1) {
        // direction.setDirectionX(getDirectionX() + 1);
        // }
        //
        // return direction;
    }
    
    /**
     * Get the opposite direction
     * 
     * @return the opposite direction
     */
    public Direction getOppositeDirection() {
        throw new RuntimeException("Not yet implemented");
        // return new Direction(-getDirectionX(), -getDirectionY());
    }
    
    /**
     * Get the direction on the right
     * 
     * @return the direction on the right
     */
    public Direction getRightDirection() {
        throw new RuntimeException("Not yet implemented");
        // Direction direction = new Direction(getDirectionX(),
        // getDirectionY());
        //
        // if (getDirectionX() == 1 && getDirectionY() > -1) {
        // direction.setDirectionY(getDirectionY() - 1);
        // } else if (getDirectionX() == -1 && getDirectionY() < 1) {
        // direction.setDirectionY(getDirectionY() + 1);
        // } else if (getDirectionY() == 1 && getDirectionX() < 1) {
        // direction.setDirectionX(getDirectionX() + 1);
        // } else if (getDirectionY() == -1 && getDirectionX() > -1) {
        // direction.setDirectionX(getDirectionX() - 1);
        // }
        //
        // return direction;
    }
    
    /**
     * Determine if two vectors are collinear
     * 
     * @param otherDirection an other direction
     * @return true if the two vectors are collinear, false otherwise
     */
    public boolean isCollinear(Direction otherDirection) {
        throw new RuntimeException("Not yet implemented");
        // float p1 = Math.abs(this.calculateScalarProduct(otherDirection));
        // float p2 = this.calculateNorm() * otherDirection.calculateNorm();
        //
        // return (p1 == p2);
    }
    
    /**
     * Determine if two vectors are collinear and have the same sense
     * 
     * @param otherDirection an other direction
     * @return true if the two vectors are collinear and have the same sense,
     *         false otherwise
     */
    public boolean isCollinearSameSense(Direction otherDirection) {
        throw new RuntimeException("Not yet implemented");
        // float scalarProduct = this.calculateScalarProduct(otherDirection);
        // float normProduct = this.calculateNorm() *
        // otherDirection.calculateNorm();
        //
        // return (scalarProduct == normProduct);
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
