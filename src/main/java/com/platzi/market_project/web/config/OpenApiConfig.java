package com.platzi.market_project.web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("1.0")
                .description("Proyecto de API con SpringBoot y SpringData JPA")
                .contact(new Contact()
                        .email("jhosbyndaniel@gmail.com")
                        .url("https://github.com/Patchwtf")));
    }
}
