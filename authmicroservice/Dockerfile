FROM openjdk:8
EXPOSE 5000
ADD target/auth-service.jar auth-service.jar
ENTRYPOINT ["java","-jar","auth-service.jar"]