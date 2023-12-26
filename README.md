# Example JSP project with Tomcat and Maven

A simple JSP project to introduce working with Maven.
The project is packaged as a war file and deployed onto a dockerized Tomcat server.

## Building

The below command removes the target folder, compiles the code, runs the tests and creates a WAR file.

`mvn clean install`

## Running locally

The below command compiles the code, runs the tests, creates a WAR file and deploys it onto an in-memory Jetty web server.

`mvn install jetty:run`

To deploy the code onto a dockerized Tomcat server, use the following commands:

```shell
mvn clean install
docker run -it --rm -v $PWD/target/tomcatjspexample-1.0-SNAPSHOT.war:/usr/local/tomcat/webapps/ROOT.war -p 8080:8080 tomcat:9.0
```

TODO:
* Database and tests
* Github Actions