#Animal-management-System
This project can be used to insert , delete , update animal data,it also available to show animal details by searching.

Insert : insert animal by inputting data
Delete: delete animal by enter animal code
Update: update animal by enter animal name
Show details: table to show detail
search: search animal by entering animal name
Test Project

##It also provides JUnit test for project.

##Logback with slf4j

<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
        <level>ALL</level>
    </filter>
    <encoder>
        <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
    </encoder>
</appender>

<root level="ALL">
    <appender-ref ref="STDOUT" />
</root>
##JDK8 support

        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-enforcer-plugin</artifactId>
            <version>1.4.1</version>
            <executions>
                <execution>
                    <configuration>
                        <id>enforce-version</id>
                        <goals>
                            <goal>enforce</goal>
                        </goals>
                        <configuration>
                            <rules>
                                <requireJavaVersion>1.8</requireJavaVersion>
                            </rules>
                        </configuration>          
                    </configuration>
                </execution>
            </executions>
        </plugin>
