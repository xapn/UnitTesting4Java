/**
 * 
 */
package xapn.projects.testing.fest.festassert;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Assertions with FEST-Assert.
 * 
 * @author Xavier Pigeon
 */
public class AssertionsWithFestAssertTest {
    
    @Test
    public void assertThat_boolean_isTrue_isFalse_isSameAs() {
        assertThat(true).isTrue();
        assertThat(false).isFalse();
        assertThat(true).isSameAs(true);
    }
    
    @Test
    public void assertThat_int_isGreaterThan_isLessThan_isZero_isNegative_isPositive_isEqualTo() {
        assertThat(0).isGreaterThan(-1).isLessThan(1).isZero();
        assertThat(-2).isNegative();
        assertThat(6).isPositive().isEqualTo(6);
    }
    
    @Test
    public void assertThat_list_hasSize_contains() {
        StarWarsAntagonist yoda = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist anakin = new StarWarsAntagonist("Anakin");
        List<StarWarsAntagonist> antagonists = new ArrayList<StarWarsAntagonist>();
        antagonists.add(yoda);
        antagonists.add(anakin);
        
        assertThat(antagonists).hasSize(2).contains(yoda, anakin);
    }
    
    @Test
    public void assertThat_map_excludes() {
        StarWarsAntagonist yoda = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist anakin = new StarWarsAntagonist("Anakin");
        StarWarsAntagonist sidious = new StarWarsAntagonist("Darth Sidious");
        Map<String, StarWarsAntagonist> myMap = new HashMap<String, StarWarsAntagonist>();
        myMap.put("jedi", yoda);
        myMap.put("sith", anakin);
        
        assertThat(myMap).excludes(entry("sith", sidious));
    }
    
    @Test
    public void assertThat_map_isEmpty() {
        assertThat(Collections.EMPTY_MAP).isEmpty();
    }
    
    @Test
    public void assertThat_map_isNotEmpty_includes() {
        StarWarsAntagonist yoda = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist anakin = new StarWarsAntagonist("Anakin");
        Map<String, StarWarsAntagonist> myMap = new HashMap<String, StarWarsAntagonist>();
        myMap.put("jedi", yoda);
        myMap.put("sith", anakin);
        
        assertThat(myMap).isNotEmpty().includes(entry("jedi", yoda), entry("sith", anakin));
    }
    
    @Test
    public void assertThat_object_isIn_isNotIn_isNotEqualTo() {
        StarWarsAntagonist yoda = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist anakin = new StarWarsAntagonist("Anakin");
        StarWarsAntagonist sidious = new StarWarsAntagonist("Darth Sidious");
        
        assertThat(yoda).isIn(yoda, anakin).isNotIn(anakin, sidious);
        assertThat(anakin).isNotEqualTo(sidious);
    }
    
    @Test
    public void assertThat_object_isInstanceOf_isEqualTo_isNotEqualTo() {
        StarWarsAntagonist yoda = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist foundJedi = new StarWarsAntagonist("Yoda");
        StarWarsAntagonist foundSith = new StarWarsAntagonist("Darth Sidious");
        
        assertThat(yoda).isInstanceOf(StarWarsAntagonist.class).isEqualTo(foundJedi).isNotEqualTo(foundSith);
    }
    
    @Test
    public void assertThat_object_isNotNull() {
        assertThat(new Object()).isNotNull();
    }
    
    @Test
    public void assertThat_object_isNull() {
        Object nullObject = null;
        
        assertThat(nullObject).isNull();
    }
    
    @Test
    public void assertThat_stringTable_contains_containsOnly() {
        String[] fellowshipOfTheRing = { "Gandalf", "Arwen", "Gimli" };
        
        assertThat(fellowshipOfTheRing).contains("Arwen");
        assertThat(fellowshipOfTheRing).containsOnly("Gandalf", "Arwen", "Gimli");
    }
}
