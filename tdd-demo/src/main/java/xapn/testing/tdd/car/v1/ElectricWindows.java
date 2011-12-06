package xapn.testing.tdd.car.v1;

/**
 * Electric windows
 * 
 * @author Xavier Pigeon
 */
public class ElectricWindows {
    
    private final boolean open = false;
    
    public void fermer() {
        throw new RuntimeException("Not yet implemented");
    }
    
    public void ouvrir() {
        throw new RuntimeException("Not yet implemented");
    }

    /**
     * Getter for the field {@code open}
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }
}
