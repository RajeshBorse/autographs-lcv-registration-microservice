FROM --platform=linux/amd64 openjdk:15
COPY  target/autographs-lcv-registration-microservice.jar autographs-lcv-registration-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-lcv-registration-microservice.jar"]
EXPOSE 8002