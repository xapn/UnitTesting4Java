/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A PriceFinder is a class that goes and retrieves a price for a symbol
 * asynchronously, returning immediately. Sometime later it receives a response
 * and performs a callback on a handler. One has left out the implementation of
 * how it actually does this (maybe a web-service, database call or JMS
 * message).
 * 
 * @author Xavier Pigeon
 */
public class PriceFinder {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceFinder.class);
    
    private PriceService priceService;
    
    /**
     * Find the price of a symbol.
     * 
     * @param symbol the symbol to be searched
     * @param handler the handler given by the test
     */
    public void findPrice(String symbol, IPriceHandler handler) {
        LOGGER.debug("Service calling");
        // Comment the following code line for the test failing.
        priceService.findPrice(symbol, handler);
    }
    
    /**
     * Getter for the field {@code priceService}
     * 
     * @return the priceService
     */
    public PriceService getPriceService() {
        return priceService;
    }
    
    /**
     * Setter for the field {@code priceService}
     * 
     * @param priceService the priceService to set
     */
    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }
}
