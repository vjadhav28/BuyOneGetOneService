package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BogoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogoApplication.class, args);
        System.out.println("Access Swagger UI:\n" +
                "================================" +
                "Open the browser and navigate to http://localhost:8080/swagger-ui/ " +
                "or http://localhost:8080/swagger-ui.html." +
                "=================================================");
    }
}