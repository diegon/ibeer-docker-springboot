FROM openjdk:8-jdk-alpine
ADD ./target/gs-spring-boot-docker-0.1.0.jar ibeer-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","ibeer-demo.jar"]
