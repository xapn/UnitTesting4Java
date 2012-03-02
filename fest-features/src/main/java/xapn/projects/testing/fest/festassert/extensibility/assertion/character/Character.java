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
 * A simple class to illustrate Fest assertions.
 * 
 * @author Joel Costigliola
 */
public class Character {
    
    private final String name;
    private final Race race;
    private final int age;
    
    public Character(String name, int age, Race race) {
        super();
        this.name = name;
        this.age = age;
        this.race = race;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    public Race getRace() {
        return race;
    }
}
