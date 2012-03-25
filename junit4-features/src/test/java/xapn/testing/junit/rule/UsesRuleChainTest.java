/**
 * 
 */
package xapn.testing.junit.rule;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import xapn.testing.junit.rule.custom.LoggingRule;

/**
 * The RuleChain rule allows ordering of TestRules. You create a RuleChain with
 * outerRule(TestRule) and subsequent calls of around(TestRule).
 * 
 * @author Xavier Pigeon
 */
public class UsesRuleChainTest {
    
    @Rule
    public TestRule chain = RuleChain //
            .outerRule(new LoggingRule("Outer rule")) //
            .around(new LoggingRule("Middle rule")) //
            .around(new LoggingRule("Inner rule"));
    
    @Test
    public void example() {
        assertTrue(true);
    }
}
