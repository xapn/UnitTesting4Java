/**
 * 
 */
package xapn.testing.unitils.spring;

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
        System.out.println(result + " Done");
    }
    
    /**
     * Getter for the field {@code bar}
     * 
     * @return the bar
     */
    public Bar getBar() {
        return bar;
    }
    
    /**
     * Setter for the field {@code bar}
     * 
     * @param bar the bar to set
     */
    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
