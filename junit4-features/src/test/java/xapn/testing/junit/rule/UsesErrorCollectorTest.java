/**
 * 
 */
package xapn.testing.junit.rule;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * The ErrorCollector rule allows execution of a test to continue after the
 * first problem is found (for example, to collect _all_ the incorrect rows in a
 * table, and report them all at once).
 * 
 * @author Xavier Pigeon
 */
public class UsesErrorCollectorTest {
    
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void example_must_fail() {
        collector.addError(new Throwable("First thing went wrong"));
        collector.addError(new Throwable("Second thing went wrong"));
        collector.checkThat("ERROR!", not(containsString("ERROR!")));
        collector.checkThat("ERROR", not("ERROR"));
        collector.checkThat("OK", not("ERROR"));
        System.out.println("Got here!");
        // All lines will run, and then a combined failure logged at the end.
    }
}
