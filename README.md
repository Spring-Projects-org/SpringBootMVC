# SpringBootMVC
SpringBootMVC

Spring Boot is a Framework from “The Spring Team” to ease the bootstrapping and development of new Spring Applications.
It provides defaults for code and annotation configuration to quick start new Spring projects within no time. It follows “Opinionated Defaults Configuration” Approach to avoid lot of boilerplate code and configuration to improve Development, Unit Test and Integration Test Process.

# Advantages of Spring Boot:
1. It is very easy to develop Spring Based applications with Java or Groovy.
2. It reduces lots of development time and increases productivity.
3. It avoids writing lots of boilerplate Code, Annotations and XML Configuration.
4. It is very easy to integrate Spring Boot Application with its Spring Ecosystem like Spring JDBC, Spring ORM, Spring Data, Spring Security etc.
5. It follows “Opinionated Defaults Configuration” Approach to reduce Developer effort
6. It provides Embedded HTTP servers like Tomcat, Jetty etc. to develop and test our web applications very easily.
7. It provides CLI (Command Line Interface) tool to develop and test Spring Boot(Java or Groovy) Applications from command prompt very easily and quickly.
8. It provides lots of plugins to develop and test Spring Boot Applications very easily using Build Tools like Maven and Gradle
9. It provides lots of plugins to work with embedded and in-memory Databases very easily.

# Main Goal of Spring Boot:
The main goal of Spring Boot Framework is to reduce Development, Unit Test and Integration Test time and to ease the development of Production ready web applications very easily compared to existing Spring Framework, which really takes more time.

1. To avoid XML Configuration completely
2. To avoid defining more Annotation Configuration(It combined some existing Spring Framework Annotations to a simple and single Annotation)
3 To avoid writing lots of import statements
4 To provide some defaults to quick start new projects within no time.
5. To provide Opinionated Development approach.
6. By providing or avoiding these things, Spring Boot Framework reduces Development time, Developer Effort and increases productivity.

# Steps to run the programm
1. Clone the project and import into STS.
2. Run main class SpringBootMvcApplication
3. You can check in console embeded Tomcat server is started with port defined in application.properties
4. Hit default URL- localhost:8083 once server is started. You will get home page

# Imp Points
1. If you check code you can see I have not defined any component, configuration defined which is actually taken care by boot App.
2. I have not defined specific views location in xml file configuration. 
3. I have used theamlyfe instead of JSP and kept under resources/templates with .html extension. Check the application.properties for configuration for theamlyfe view
