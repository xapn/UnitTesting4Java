/**
 * 
 */
package xapn.testing.hamcrest.domain;

/**
 * Ordinary system.
 * 
 * @author Xavier Pigeon
 */
public class OrdinarySystem {
    
    private int level;
    private int power;
    private boolean ready;
    
    /**
     * Default constructor.
     */
    public OrdinarySystem() {
        level = 0;
        power = 0;
        ready = false;
    }
    
    /**
     * Constructor.
     * 
     * @param level
     * @param power
     * @param ready
     */
    public OrdinarySystem(int level, int power, boolean ready) {
        super();
        this.level = level;
        this.power = power;
        this.ready = ready;
    }
    
    /**
     * Getter for the field {@code level}
     * 
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Getter for the field {@code power}
     * 
     * @return the power
     */
    public int getPower() {
        return power;
    }
    
    /**
     * Getter for the field {@code ready}
     * 
     * @return the ready
     */
    public boolean isReady() {
        return ready;
    }
    
    /**
     * Setter for the field {@code level}
     * 
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    
    /**
     * Setter for the field {@code power}
     * 
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }
    
    /**
     * Setter for the field {@code ready}
     * 
     * @param ready the ready to set
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    @Override
    public String toString() {
        return "ordinarySystem [level=" + level + ", power=" + power + ", ready=" + ready + "]";
    }
}
