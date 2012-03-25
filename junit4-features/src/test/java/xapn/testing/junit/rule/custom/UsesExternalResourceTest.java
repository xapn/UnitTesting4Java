/**
 * 
 */
package xapn.testing.junit.rule.custom;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * ExternalResource is a base class for Rules (like TemporaryFolder) that set up
 * an external resource before a test (a file, socket, server, database
 * connection, etc.), and guarantee to tear it down afterward.
 * 
 * @author Xavier Pigeon
 */
public class UsesExternalResourceTest {
    
    private InputStream googleHome = null;
    
    @Rule
    public ExternalResource resource = new ExternalResource() {
        
        @Override
        protected void after() {
            if (googleHome != null) {
                try {
                    System.out.println("Closing the stream.");
                    googleHome.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
        
        @Override
        protected void before() throws Throwable {
            System.out.println("Opening the stream.");
            googleHome = new URL("http://www.google.com").openStream();
        }
    };
    
    @Test
    public void doctypeIsHtml() throws IOException {
        byte[] buf = new byte[21];
        
        // Process
        googleHome.read(buf);
        
        // Verification
        String actual = new String(buf);
        System.out.println(actual);
        assertTrue("Expected doctype html", actual.contains("doctype html"));
    }
}
