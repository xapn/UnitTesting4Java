/**
 * 
 */
package xapn.projects.testing.fest.festassert;

/**
 * @author Xavier Pigeon
 */
public class StarWarsAntagonist {
    
    private String name;
    
    public StarWarsAntagonist(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean equality = false;
        
        if (obj instanceof StarWarsAntagonist) {
            StarWarsAntagonist other = (StarWarsAntagonist) obj;
            
            if ((name != null) && name.equals(other.name)) {
                equality = true;
            }
        }
        
        return equality;
    }
    
    /**
     * Getter for the field {@code name}
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter for the field {@code name}
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
