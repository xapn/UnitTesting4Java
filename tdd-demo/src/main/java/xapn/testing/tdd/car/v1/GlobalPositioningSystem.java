package xapn.testing.tdd.car.v1;

/**
 * Global Positioning System
 * 
 * @author Xavier Pigeon
 */
public class GlobalPositioningSystem {
    
    private Position currentPosition;
    private Position destination;
    private Direction direction;
    private IRoadMap roadMap;
    private boolean turnedOn;
    
    /**
     * Default constructor
     */
    public GlobalPositioningSystem() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code currentPosition}
     * 
     * @return the currentPosition
     */
    public Position getCurrentPosition() {
        return currentPosition;
    }
    
    /**
     * Getter for the field {@code destination}
     * 
     * @return the destination
     */
    public Position getDestination() {
        return destination;
    }
    
    /**
     * Getter for the field {@code direction}
     * 
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }
    
    /**
     * Getter for the field {@code roadMap}
     * 
     * @return the roadMap
     */
    public IRoadMap getRoadMap() {
        return roadMap;
    }
    
    /**
     * Getter for the field {@code turnedOn}
     * 
     * @return the turnedOn
     */
    public boolean isTurnedOn() {
        return turnedOn;
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must go straight on, false otherwise
     */
    public boolean mustGoStraightOn() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn around, false otherwise
     */
    public boolean mustTurnAround() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn left, false otherwise
     */
    public boolean mustTurnLeft() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn right, false otherwise
     */
    public boolean mustTurnRight() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Setter for the field {@code currentPosition}
     * 
     * @param currentPosition the currentPosition to set
     */
    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }
    
    /**
     * Setter for the field {@code destination}
     * 
     * @param destination the destination to set
     */
    public void setDestination(Position destination) {
        this.destination = destination;
    }
    
    /**
     * Setter for the field {@code direction}
     * 
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    /**
     * Setter for the field {@code roadMap}
     * 
     * @param roadMap the roadMap to set
     */
    public void setRoadMap(IRoadMap roadMap) {
        this.roadMap = roadMap;
    }
    
    /**
     * Setter for the field {@code turnedOn}
     * 
     * @param turnedOn the turnedOn to set
     */
    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
    
    /**
     * Turn off the GPS
     */
    public void turnOff() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Turn on the GPS
     */
    public void turnOn() {
        throw new RuntimeException("Not yet implemented");
    }
}
