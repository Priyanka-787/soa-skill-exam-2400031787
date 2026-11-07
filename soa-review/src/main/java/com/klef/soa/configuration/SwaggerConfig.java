package com.klef.soa.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("review Service")
                        .version("1.0")
                        .description("review Service Project API")
                        .contact(new Contact()
                                .name("priyanka")
                                .email("priyanka@gmail.com")));
    }
}

