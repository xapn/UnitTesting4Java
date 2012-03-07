/**
 * 
 */
package xapn.testing.unitils;

/**
 * Foo.
 * 
 * @author Xavier Pigeon
 */
public class Foo {
    
    private Bar bar;
    
    /**
     * Do something.
     */
    public void doFooThing() {
        String result = bar.doBarThing();
        System.out.println(result + " done");
    }
}
