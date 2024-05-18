package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;

import java.util.Arrays;

@SpringBootApplication
@EnableSwagger2
public class BogoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogoApplication.class, args);
        System.out.println("Swagger UI URL: http://localhost:8080/swagger-ui/");
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.example.service"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndpoints());
    }

    private ApiInfo apiEndpoints() {
        return new ApiInfo(
                "Bogo API",
                "Bogo API Description",
                "1.0",
                "Terms of service",
                new Contact("John Doe", "https://www.example.com", "john.doe@example.com"),
                "License of API", "API license URL", Arrays.asList(new VendorExtension[]{new MyVendorExtension("OAI-PMH", "http://www.oai-pmh.org/spec/")})
        );
    }
}