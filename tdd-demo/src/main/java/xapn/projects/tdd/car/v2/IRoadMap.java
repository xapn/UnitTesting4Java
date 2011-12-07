/**
 * 
 */
package xapn.projects.tdd.car.v2;

/**
 * Interface for any road map
 * 
 * @author Xavier Pigeon
 */
public interface IRoadMap {
    
    /**
     * Indicate if a barrier is known at a point
     * 
     * @param position the position to check
     * @return true if a barrier is known at this point, false otherwise
     */
    boolean indicateBarrier(Position position);
}
