/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A PriceFinder is a class that goes and retrieves a price for a symbol
 * asynchronously, returning immediately. Sometime later it receives a response
 * and performs a callback on a handler. One has left out the implementation of
 * how it actually does this (maybe a web-service, database call or JMS
 * message).
 * 
 * @author Xavier Pigeon
 */
@Service
public class PriceFinder {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceFinder.class);
    
    @Autowired
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
}
