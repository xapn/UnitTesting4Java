/**
 * 
 */
package xapn.testing.junit.rule.custom;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Log rule.
 * 
 * @author Xavier Pigeon
 */
public class LogRule implements TestRule {
    
    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            
            @Override
            public void evaluate() throws Throwable {
                String methodNameOnClassName = description.getMethodName() + " on " + description.getClassName();
                System.out.println("Begin " + methodNameOnClassName);
                base.evaluate();
                System.out.println("End " + methodNameOnClassName);
            }
        };
    }
}
