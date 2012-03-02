/*
 * Created on May 26, 2010
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * Copyright @2010 the original author or authors.
 */
package xapn.projects.testing.fest.festassert.extensibility.assertion.character;

/**
 * Race in Tolkien's Lord of the Rings.
 * 
 * @author Joel Costigliola
 */
public class Race {
    
    public final static Race HOBBIT = new Race("Hobbit", false);
    public final static Race MAIA = new Race("Maia", true);
    public final static Race MAN = new Race("Man", false);
    public final static Race ELF = new Race("Elf", true);
    public final static Race DWARF = new Race("Dwarf", false);
    public final static Race ORC = new Race("Orc", false);
    
    private final String name;
    private final boolean immortal;
    
    public Race(String name, boolean immortal) {
        super();
        this.name = name;
        this.immortal = immortal;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isImmortal() {
        return immortal;
    }
    
    @Override
    public String toString() {
        return "Race [name=" + name + ", immortal=" + immortal + "]";
    }
}
