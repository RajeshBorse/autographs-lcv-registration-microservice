package com.module.autographs.lcvregistration.microservice;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AutographsLcvRegistrationApplication {

    private static final Logger logger = LogManager.getLogger(AutographsLcvRegistrationApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(AutographsLcvRegistrationApplication.class, args);
        logger.info("Autographs LCV Registration Microservices");
    }

    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI().info(apiInfo());
    }

    public Info apiInfo() {
        Info info = new Info();
        info.title("Autographs LCV Registration Microservices API").description("Live Code System Swagger Open API").version("v1.0.0");
        return info;
    }

}
