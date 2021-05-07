package com.exercise.identification.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket apiDocket(
        @Value("${info.app.name}") final String title,
        @Value("${info.app.description}") final String description,
        @Value("${info.app.version}") final String version,
        @Value("${info.app.email}") final String email
    ) {
        final ApiInfo info = new ApiInfo(
            title,
            description,
            version,
            null,
            new Contact("Bryce Francis Deyto", null, email),
            null,
            null,
            Collections.emptyList()
        );

        return new Docket(DocumentationType.OAS_30)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.exercise.identification"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(info);
    }
}
