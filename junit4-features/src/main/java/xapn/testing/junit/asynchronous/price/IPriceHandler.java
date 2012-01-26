/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

/**
 * Interface for any handler
 * 
 * @author Xavier Pigeon
 */
public interface IPriceHandler {
    
    /**
     * The method to be called for a callback on a handler
     * 
     * @param price the price to be returned
     */
    void foundPrice(Price price);
}
