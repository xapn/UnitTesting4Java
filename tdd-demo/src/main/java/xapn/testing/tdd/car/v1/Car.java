package xapn.testing.tdd.car.v1;

/**
 * Car
 * 
 * @author Xavier Pigeon
 */
public class Car {
    
    private AirConditioning airConditioning;
    private Doors doors;
    private ElectricWindows electricWindows;
    private Engine engine;
    private GlobalPositioningSystem gps;
    private Headlights headlights;
    private Wheel wheel;
    
    /**
     * Default constructor
     */
    public Car() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Cool the interior
     * 
     * @param delta the temperature difference
     */
    public void coolInterior(int delta) {
        throw new RuntimeException("Not yet implemented");
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
    }
    
    /**
     * Move to a destination
     * 
     * @param destination the destination where to move
     */
    public void move(Position destination) {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Setter for the field {@code airConditioning}
     * 
     * @param airConditioning the airConditioning to set
     */
    public void setAirConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }
    
    /**
     * Setter for the field {@code doors}
     * 
     * @param doors the doors to set
     */
    public void setDoors(Doors doors) {
        this.doors = doors;
    }
    
    /**
     * Setter for the field {@code electricWindows}
     * 
     * @param electricWindows the electricWindows to set
     */
    public void setElectricWindows(ElectricWindows electricWindows) {
        this.electricWindows = electricWindows;
    }
    
    /**
     * Setter for the field {@code engine}
     * 
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    /**
     * Setter for the field {@code gps}
     * 
     * @param gps the gps to set
     */
    public void setGps(GlobalPositioningSystem gps) {
        this.gps = gps;
    }
    
    /**
     * Setter for the field {@code headlights}
     * 
     * @param headlights the headlights to set
     */
    public void setHeadlights(Headlights headlights) {
        this.headlights = headlights;
    }
    
    /**
     * Setter for the field {@code wheel}
     * 
     * @param wheel the wheel to set
     */
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    
    /**
     * Start
     */
    public void start() {
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * Stop
     */
    public void stop() {
        throw new RuntimeException("Not yet implemented");
    }
}
