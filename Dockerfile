FROM openjdk:15
ADD target/autographs-lcv-registration-microservice.jar autographs-lcv-registration-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-lcv-registration-microservice.jar"]
EXPOSE 8002