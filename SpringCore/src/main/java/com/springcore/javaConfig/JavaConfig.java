package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class JavaConfig {
    @Bean
    public Idli getIdli() {
        return new Idli();
    }

    @Bean(name = {"student", "temp"})
    public StudentInfo getStudent() {
        // creating a new student object
        StudentInfo student = new StudentInfo(getIdli());
        return student;
    }
}
