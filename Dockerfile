FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
EXPOSE 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","/app.war"]

#FROM tomcat:9.0
#COPY target/*.war /usr/local/tomcat/webapps/
#EXPOSE 8081

