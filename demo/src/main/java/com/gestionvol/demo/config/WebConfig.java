package com.gestionvol.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permet toutes les requêtes
                .allowedOrigins("http://localhost:4200") // Autorise le domaine Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permet certains types de requêtes
                .allowedHeaders("*"); // Autorise tous les en-têtes
    }
}
