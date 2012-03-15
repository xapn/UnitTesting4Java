#!/bin/sh
# Under the project root directory, run "sh ./src/main/resources/<shell_name>.sh".
mvn exec:java -Dexec.mainClass="org.hamcrest.generator.config.XmlConfigurator" -Dexec.args="src/main/resources/sugar-generation.xml src/main/java xapn.testing.hamcrest.generated.MyMatchers src/main/java"
