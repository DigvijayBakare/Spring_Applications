package com.dependingInjuction.scopeTesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope(scopeName = "prototype")
    public FirstClass firstClass() {
        return new FirstClass();
    }

    @Bean
//    @Scope(scopeName = "prototype")
    public SecondClass secondClass() {
        return new SecondClass();
    }
}
