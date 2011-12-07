/**
 * 
 */
package xapn.projects.tdd.car.v3;

import xapn.projects.tdd.car.v3.geometry.Vector;

/**
 * Direction
 * 
 * @author Xavier Pigeon
 */
public class Direction {
    
    private Vector vector;
    
    /**
     * Default constructor
     */
    public Direction() {
        vector = new Vector(0, 0);
    }
    
    /**
     * Constructor
     * 
     * @param directionX the x axis direction value
     * @param directionY the y axis direction value
     */
    public Direction(int directionX, int directionY) {
        vector = new Vector(directionX, directionY);
    }
    
    /**
     * Constructor
     * 
     * @param origin the origin position
     * @param extremity the extremity position
     */
    public Direction(Position origin, Position extremity) {
        vector = new Vector(extremity.getX() - origin.getX(), extremity.getY() - origin.getY());
    }
    
    /**
     * Calculate the norm of the vector
     * 
     * @return the norm
     */
    public float calculateNorm() {
        return (float) Math.sqrt(getDirectionX() * getDirectionX() + getDirectionY() * getDirectionY());
    }
    
    /**
     * Calculate a scalar product between two vectors
     * 
     * @param otherDirection an other direction
     * @return the scalar product
     */
    public float calculateScalarProduct(Direction otherDirection) {
        return getDirectionX() * otherDirection.getDirectionX() + getDirectionY() * otherDirection.getDirectionY();
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
            
            if ((vector != null && vector.equals(other.getVecteur())) || (vector == null && other.getVecteur() == null)) {
                equality = true;
            }
        }
        
        return equality;
    }
    
    /**
     * Get the x axis vector coordinate
     * 
     * @return the directionX
     */
    public int getDirectionX() {
        return vector.getX();
    }
    
    /**
     * Get the y axis vector coordinate
     * 
     * @return the directionY
     */
    public int getDirectionY() {
        return vector.getY();
    }
    
    /**
     * Get the direction on the left
     * 
     * @return the direction on the left
     */
    public Direction getLeftDirection() {
        Direction direction = new Direction(getDirectionX(), getDirectionY());
        
        if (getDirectionX() == 1 && getDirectionY() < 1) {
            direction.setDirectionY(getDirectionY() + 1);
        } else if (getDirectionX() == -1 && getDirectionY() > -1) {
            direction.setDirectionY(getDirectionY() - 1);
        } else if (getDirectionY() == 1 && getDirectionX() > -1) {
            direction.setDirectionX(getDirectionX() - 1);
        } else if (getDirectionY() == -1 && getDirectionX() < 1) {
            direction.setDirectionX(getDirectionX() + 1);
        }
        
        return direction;
    }
    
    /**
     * Get the opposite direction
     * 
     * @return the opposite direction
     */
    public Direction getOppositeDirection() {
        return new Direction(-getDirectionX(), -getDirectionY());
    }
    
    /**
     * Get the direction on the right
     * 
     * @return the direction on the right
     */
    public Direction getRightDirection() {
        Direction direction = new Direction(getDirectionX(), getDirectionY());
        
        if (getDirectionX() == 1 && getDirectionY() > -1) {
            direction.setDirectionY(getDirectionY() - 1);
        } else if (getDirectionX() == -1 && getDirectionY() < 1) {
            direction.setDirectionY(getDirectionY() + 1);
        } else if (getDirectionY() == 1 && getDirectionX() < 1) {
            direction.setDirectionX(getDirectionX() + 1);
        } else if (getDirectionY() == -1 && getDirectionX() > -1) {
            direction.setDirectionX(getDirectionX() - 1);
        }
        
        return direction;
    }
    
    /**
     * Getter for the field {@code vector}
     * 
     * @return the vector
     */
    public Vector getVecteur() {
        return vector;
    }
    
    /**
     * Determine if two vectors are collinear
     * 
     * @param otherDirection an other direction
     * @return true if the two vectors are collinear, false otherwise
     */
    public boolean isCollinear(Direction otherDirection) {
        float p1 = Math.abs(this.calculateScalarProduct(otherDirection));
        float p2 = this.calculateNorm() * otherDirection.calculateNorm();
        
        return (p1 == p2);
    }
    
    /**
     * Determine if two vectors are collinear and have the same sense
     * 
     * @param otherDirection an other direction
     * @return true if the two vectors are collinear and have the same sense,
     *         false otherwise
     */
    public boolean isCollinearSameSense(Direction otherDirection) {
        float scalarProduct = this.calculateScalarProduct(otherDirection);
        float normProduct = this.calculateNorm() * otherDirection.calculateNorm();
        
        return (scalarProduct == normProduct);
    }
    
    /**
     * Get the x axis vector coordinate
     * 
     * @param directionX the directionX to set
     */
    public void setDirectionX(int directionX) {
        vector.setX(directionX);
    }
    
    /**
     * Set the y axis vector coordinate
     * 
     * @param directionY the directionY to set
     */
    public void setDirectionY(int directionY) {
        vector.setY(directionY);
    }
    
    /**
     * Setter for the field {@code vector}
     * 
     * @param vector the vector to set
     */
    public void setVecteur(Vector vector) {
        this.vector = vector;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Direction [directionX=" + getDirectionX() + ", directionY=" + getDirectionY() + "]";
    }
}
