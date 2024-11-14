package com.lucas.mongobasic.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    //http://localhost:8080/swagger-ui/index.html
    // 전체 문서
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(info());
    }

    private Info info() {
        return new Info()
                .title("Mongo Basic API")
                .description("Mongo API reference for developers")
                .version("1.0");
    }

    // 그룹화된 문서
//    @Bean
//    public GroupedOpenApi groupedOpenApi() {
//        return GroupedOpenApi.builder()
//                .group("Product API")
//                .pathsToMatch("/api/products/**")
//                .addOpenApiCustomizer(productApiCustomiser())
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi testGroup() {
//        return GroupedOpenApi.builder()
//                .group("Test API")
//                .pathsToMatch("/api/test/**")
//                .addOpenApiCustomizer(productApiCustomiser())
//                .build();
//    }
//
//    private OpenApiCustomizer productApiCustomiser() {
//        return openApi -> openApi.info(new Info()
//                .title("Product API")
//                .description("API for managing products")
//                .version("1.0"));
//    }
}