#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]

FROM tomcat:9:0
COPY target/*.jar /usr/local/tomcat/webapps/