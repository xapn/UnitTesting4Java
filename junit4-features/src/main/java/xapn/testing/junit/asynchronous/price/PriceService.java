/**
 * 
 */
package xapn.testing.junit.asynchronous.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * This service can be a web-service, a database call or a JMS message.
 * 
 * @author Xavier Pigeon
 */
@Service
public class PriceService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceService.class);
    private static final int DELAY = 1000;
    
    /**
     * Find the price of a symbol.
     * This method is asynchronous. Retrieving a price is simulated with a
     * <code>Thread.sleep(DELAY);</code> of one second.
     * 
     * @param symbol the symbol to be searched
     * @param handler the handler to be called after the symbol was found
     */
    @Async
    public void findPrice(String symbol, IPriceHandler handler) {
        Price price = new Price();
        
        try {
            LOGGER.debug("Sleeping...");
            Thread.sleep(DELAY);
            LOGGER.debug("Handler calling");
            handler.foundPrice(price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
