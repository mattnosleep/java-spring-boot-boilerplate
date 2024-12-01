package org.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Spring Boot REST API")
            .description("REST API documentation for Spring Data REST endpoints")
            .version("1.0.0")
            .contact(new Contact()
                .name("Your Name")
                .email("your.email@example.com")));
  }
}