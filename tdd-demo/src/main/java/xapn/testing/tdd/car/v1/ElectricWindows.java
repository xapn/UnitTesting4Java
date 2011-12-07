package xapn.testing.tdd.car.v1;

/**
 * Electric windows
 * 
 * @author Xavier Pigeon
 */
public class ElectricWindows {
    
    private boolean open = false;
    
    /**
     * Close the windows
     */
    public void close() {
        throw new RuntimeException("Not yet implemented");
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
