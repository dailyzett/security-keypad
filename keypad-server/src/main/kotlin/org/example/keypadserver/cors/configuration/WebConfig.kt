package org.example.keypadserver.cors.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig: WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/*")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedOrigins("*")
            .allowCredentials(false)
    }
}