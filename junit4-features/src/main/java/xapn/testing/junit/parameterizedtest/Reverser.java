/**
 * 
 */
package xapn.testing.junit.parameterizedtest;

/**
 * Reverser
 * 
 * @author Xavier Pigeon
 */
public class Reverser {
    
    /**
     * Reverse the character order into a given string.
     * 
     * @param material the start string
     * @return the reversed string
     */
    public String reverse(String material) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = material.length();
        
        for (int index = 0; index < length; index++) {
            stringBuilder.append(material.charAt(length - index - 1));
        }
        
        return stringBuilder.toString();
    }
}
