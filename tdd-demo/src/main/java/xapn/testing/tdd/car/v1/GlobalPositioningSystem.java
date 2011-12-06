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
    private boolean gpsTurnedOn;
    private IRoadMap roadMap;
    
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
     * Go straight on
     * 
     * @return true if one shall go straight on, false otherwise
     */
    public boolean goStraightOn() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Getter for the field {@code gpsTurnedOn}
     * 
     * @return the gpsTurnedOn
     */
    public boolean isTurnedOn() {
        return gpsTurnedOn;
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
     * Setter for the field {@code gpsTurnedOn}
     * 
     * @param gpsTurnedOn the gpsTurnedOn to set
     */
    public void setGpsTurnedOn(boolean gpsTurnedOn) {
        this.gpsTurnedOn = gpsTurnedOn;
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
     * Give advise about the way
     * 
     * @return true if one shall turn around, false otherwise
     */
    public boolean turnAround() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one shall turn left, false otherwise
     */
    public boolean turnLeft() {
        throw new RuntimeException("Not yet implemented");
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
    
    /**
     * Give advise about the way
     * 
     * @return true if one shall turn right, false otherwise
     */
    public boolean turnRight() {
        throw new RuntimeException("Not yet implemented");
    }
}
