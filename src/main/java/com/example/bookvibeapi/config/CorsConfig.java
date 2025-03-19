package com.example.bookvibeapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Dodano klasę konfiguracyjną CORS w celu umożliwienia komunikacji między frontendem (React.js) 
// a backendem (Spring Boot), gdy są uruchomione na różnych portach (React.js na porcie 3000, Spring Boot na 8080).
// Ustawienie CORS zapobiega blokadom pochodzącym z polityki bezpieczeństwa przeglądarki.

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000")  // Adres frontendu React.js
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);
    }
}