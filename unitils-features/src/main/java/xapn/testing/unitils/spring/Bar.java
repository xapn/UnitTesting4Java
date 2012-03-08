/**
 * 
 */
package xapn.testing.unitils.spring;

/**
 * Bar.
 * 
 * @author Xavier Pigeon
 */
public class Bar {
    
    private String message;
    
    /**
     * Do something.
     * 
     * @return a message
     */
    public String doBarThing() {
        System.out.println("Bar is doing something.");
        return message;
    }
    
    /**
     * Getter for the field {@code message}
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Setter for the field {@code message}
     * 
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
