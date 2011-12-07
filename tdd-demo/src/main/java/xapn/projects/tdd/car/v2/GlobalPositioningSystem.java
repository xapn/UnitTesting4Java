package xapn.projects.tdd.car.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Global Positioning System
 * 
 * @author Xavier Pigeon
 */
public class GlobalPositioningSystem {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalPositioningSystem.class);
    
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
        // turnedOn = false;
        // direction = new Direction(1, 0);
        // currentPosition = new Position();
        // destination = new Position();
        // roadMap = null;
    }
    
    /**
     * Apply instructions according to GPS-own advices
     */
    public void applyInstructions() {
        throw new RuntimeException("Not yet implemented");
        // if (mustGoStraightOn()) {
        // updateCurrentPosition();
        // } else if (mustTurnAround()) {
        // direction.change(direction.getOppositeDirection());
        // updateCurrentPosition();
        // } else if (mustTurnRight()) {
        // direction.change(direction.getRightDirection());
        // updateCurrentPosition();
        // } else if (mustTurnLeft()) {
        // direction.change(direction.getLeftDirection());
        // updateCurrentPosition();
        // }
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
     * Determine if the destination is reached
     * 
     * @return true if the destination is reached, false otherwise
     */
    public boolean isDestinationReached() {
        throw new RuntimeException("Not yet implemented");
        // return destination.equals(currentPosition);
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
        // boolean toutDroit = false;
        //
        // Direction trajectory = new Direction(currentPosition, destination);
        //
        // if (!(roadMap.indicateBarrier(new Position(currentPosition,
        // direction)))) {
        // if (trajectory.isCollinearSameSense(direction)) {
        // toutDroit = true;
        // LOGGER.debug("Go straight on");
        // } else if (trajectory.calculateScalarProduct(direction) >
        // trajectory.calculateScalarProduct(direction
        // .getRightDirection())
        // && trajectory.calculateScalarProduct(direction) >
        // trajectory.calculateScalarProduct(direction
        // .getLeftDirection())) {
        // toutDroit = true;
        // LOGGER.debug("Go straight on");
        // }
        // }
        //
        // return toutDroit;
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn around, false otherwise
     */
    public boolean mustTurnAround() {
        throw new RuntimeException("Not yet implemented");
        // boolean around = false;
        //
        // if (((destination.getX() - currentPosition.getX()) *
        // direction.getDirectionX() < 0)
        // && ((destination.getY() - currentPosition.getY()) *
        // direction.getDirectionY() < 0)) {
        // around = true;
        // LOGGER.debug("Turn around as soon as possible");
        // }
        //
        // return around;
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn left, false otherwise
     */
    public boolean mustTurnLeft() {
        throw new RuntimeException("Not yet implemented");
        // boolean onTheLeft = false;
        //
        // Direction directionDroite = direction.getRightDirection();
        // Direction directionGauche = direction.getLeftDirection();
        // Direction directionDestination = new Direction(destination.getX() -
        // currentPosition.getX(), destination.getY()
        // - currentPosition.getY());
        //
        // if (directionDestination.calculateScalarProduct(directionGauche) >=
        // directionDestination
        // .calculateScalarProduct(directionDroite)
        // && !(roadMap.indicateBarrier(new Position(currentPosition,
        // directionGauche)))) {
        // onTheLeft = true;
        // LOGGER.debug("Please turn left");
        // } else {
        // onTheLeft = false;
        // }
        //
        // return onTheLeft;
    }
    
    /**
     * Give advise about the way
     * 
     * @return true if one must turn right, false otherwise
     */
    public boolean mustTurnRight() {
        throw new RuntimeException("Not yet implemented");
        // boolean onTheRight = false;
        //
        // Direction directionDroite = direction.getRightDirection();
        // Direction directionGauche = direction.getLeftDirection();
        // Direction directionDestination = new Direction(destination.getX() -
        // currentPosition.getX(), destination.getY()
        // - currentPosition.getY());
        //
        // if (directionDestination.calculateScalarProduct(directionDroite) >=
        // directionDestination
        // .calculateScalarProduct(directionGauche)
        // && !(roadMap.indicateBarrier(new Position(currentPosition,
        // directionDroite)))) {
        // onTheRight = true;
        // LOGGER.debug("Please turn right");
        // } else {
        // onTheRight = false;
        // }
        //
        // return onTheRight;
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
        // setTurnedOn(false);
        // LOGGER.debug("GPS turned off");
    }
    
    /**
     * Turn on the GPS
     */
    public void turnOn() {
        throw new RuntimeException("Not yet implemented");
        // setTurnedOn(true);
        // LOGGER.debug("GPS turned on");
    }
    
    /**
     * Update the current position after movement according to a given direction
     */
    public void updateCurrentPosition() {
        throw new RuntimeException("Not yet implemented");
        // String previous = currentPosition.toString();
        // currentPosition.applyDirection(direction);
        // LOGGER.debug(previous + " => " + currentPosition.toString() + " | " +
        // direction.toString());
    }
}
