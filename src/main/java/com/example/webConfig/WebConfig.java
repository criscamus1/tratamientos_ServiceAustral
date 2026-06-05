package com.example.webConfig;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.context.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;;

@Configuration
public class WebConfig {
    @Bean
    public WebClient jaulasWebClient() {
        return WebClient.builder().baseUrl("http://localhost:8082/api/jaulas").build();
    }    

    @Bean
    public WebClient veterinarioWebClient() {
        return WebClient.builder().baseUrl("http://localhost:8086/api/veterinarios").build();
    }
}