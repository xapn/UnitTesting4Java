/**
 * 
 */
package xapn.testing.junit.rule.custom;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Logging rule.
 * 
 * @author Xavier Pigeon
 */
public class LoggingRule implements TestRule {
    
    private String message;
    
    /**
     * Default constructor.
     * 
     * @param message
     */
    public LoggingRule(String message) {
        super();
        this.message = message;
    }
    
    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Starting " + message);
                base.evaluate();
                System.out.println(message + " finished");
            }
        };
    }
}
