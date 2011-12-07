package xapn.projects.tdd.car.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Electric windows
 * 
 * @author Xavier Pigeon
 */
public class ElectricWindows {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ElectricWindows.class);
    
    private boolean open = false;
    
    /**
     * Close the windows
     */
    public void close() {
        throw new RuntimeException("Not yet implemented");
        // open = false;
        // LOGGER.debug("Vitres fermées");
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
     * Open the windows
     */
    public void open() {
        throw new RuntimeException("Not yet implemented");
        // open = true;
        // LOGGER.debug("Vitres open");
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
