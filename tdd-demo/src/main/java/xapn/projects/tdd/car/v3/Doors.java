/**
 * 
 */
package xapn.projects.tdd.car.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Doors
 * 
 * @author Xavier Pigeon
 */
public class Doors {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Doors.class);
    
    private boolean open;
    
    /**
     * Default constructor
     */
    public Doors() {}
    
    /**
     * Close the doors
     */
    public void close() {
        open = false;
        LOGGER.debug("Doors closed");
    }
    
    /**
     * Getter for the field {@code open}
     * 
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }
    
    /**
     * Open the doors
     */
    public void open() {
        open = true;
        LOGGER.debug("Doors open");
    }
    
    /**
     * Setter for the field {@code open}
     * 
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }
}
