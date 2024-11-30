package com.beans.annotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {
    @Bean
    public Movies movies() {
        return new Movies("THOR", "1/1/2014");
    }
}
