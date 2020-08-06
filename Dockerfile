FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD /target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user-service.jar"]