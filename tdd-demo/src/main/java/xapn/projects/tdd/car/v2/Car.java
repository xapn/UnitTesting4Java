package xapn.projects.tdd.car.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Car
 * 
 * @author Xavier Pigeon
 */
public class Car {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);
    
    private final AirConditioning airConditioning;
    private final Doors doors;
    private final ElectricWindows electricWindows;
    private final Engine engine;
    private final GlobalPositioningSystem gps;
    private final Headlights headlights;
    private final Wheel wheel;
    
    /**
     * Default constructor
     */
    public Car() {
        throw new RuntimeException("Not yet implemented");
        // doors = new Doors();
        // engine = new Engine();
        // headlights = new Headlights();
        // gps = new GlobalPositioningSystem();
        // wheel = new Wheel();
        // airConditioning = new AirConditioning();
        // electricWindows = new ElectricWindows();
    }
    
    /**
     * Cool the interior
     * 
     * @param delta the temperature difference
     */
    public void coolInterior(int delta) {
        throw new RuntimeException("Not yet implemented");
        // if (!airConditioning.isTurnedOn()) {
        // airConditioning.turnOn();
        // }
        //
        // if (electricWindows.isOpen()) {
        // electricWindows.close();
        // }
        //
        // airConditioning.cool(delta);
    }
    
    /**
     * Getter for the field {@code airConditioning}
     * 
     * @return the airConditioning
     */
    public AirConditioning getAirConditioning() {
        return airConditioning;
    }
    
    /**
     * Getter for the field {@code doors}
     * 
     * @return the doors
     */
    public Doors getDoors() {
        return doors;
    }
    
    /**
     * Getter for the field {@code electricWindows}
     * 
     * @return the electricWindows
     */
    public ElectricWindows getElectricWindows() {
        return electricWindows;
    }
    
    /**
     * Getter for the field {@code engine}
     * 
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }
    
    /**
     * Getter for the field {@code gps}
     * 
     * @return the gps
     */
    public GlobalPositioningSystem getGps() {
        return gps;
    }
    
    /**
     * Getter for the field {@code headlights}
     * 
     * @return the headlights
     */
    public Headlights getHeadlights() {
        return headlights;
    }
    
    /**
     * Getter for the field {@code wheel}
     * 
     * @return the wheel
     */
    public Wheel getWheel() {
        return wheel;
    }
    
    /**
     * Heat the interior
     * 
     * @param delta the temperature difference
     */
    public void heatInterior(int delta) {
        throw new RuntimeException("Not yet implemented");
        // if (!airConditioning.isTurnedOn()) {
        // airConditioning.turnOn();
        // }
        //
        // if (electricWindows.isOpen()) {
        // electricWindows.close();
        // }
        //
        // airConditioning.heat(delta);
    }
    
    /**
     * Move from the current position to a destination
     * 
     * @param destination the destination where to move
     */
    public void move(Position destination) {
        throw new RuntimeException("Not yet implemented");
        // LOGGER.debug("Movement in progress: " +
        // gps.getCurrentPosition().toString() + " to " + destination.toString()
        // + " | " + gps.getDirection().toString());
        //
        // gps.getDestination().change(destination);
        // engine.speedUp(1);
        //
        // while (!(gps.isDestinationReached())) {
        // if (gps.mustGoStraightOn()) {
        // engine.speedUp(1);
        // wheel.goStraightOn();
        // gps.applyInstructions();
        // } else if (gps.mustTurnAround()) {
        // wheel.turnAround();
        // gps.applyInstructions();
        // } else if (gps.mustTurnRight()) {
        // if (engine.getSpeed() > 1) {
        // engine.speedDown(1);
        // }
        // wheel.turnRight();
        // gps.applyInstructions();
        // } else if (gps.mustTurnLeft()) {
        // if (engine.getSpeed() > 1) {
        // engine.speedDown(1);
        // }
        // wheel.turnLeft();
        // gps.applyInstructions();
        // }
        // }
        //
        // engine.speedDown(engine.getSpeed());
        //
        // LOGGER.debug("Movement over");
    }
    
    /**
     * Start
     */
    public void start() {
        throw new RuntimeException("Not yet implemented");
        // doors.close();
        // engine.start();
        // gps.turnOn();
        // LOGGER.debug("Car started");
    }
    
    /**
     * Stop
     */
    public void stop() {
        throw new RuntimeException("Not yet implemented");
        // engine.stop();
        // headlights.turnOff();
        // gps.turnOff();
        // LOGGER.debug("Car stopped");
    }
}
