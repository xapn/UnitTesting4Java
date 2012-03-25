/**
 * 
 */
package xapn.testing.junit.rule.custom;

/**
 * Error Log.
 * 
 * @author Xavier Pigeon
 */
public class ErrorLog {
    
    private StringBuilder errorMessage;
    
    public ErrorLog() {
        errorMessage = new StringBuilder();
    }
    
    public boolean isEmpty() {
        return errorMessage.length() == 0;
    }
}
