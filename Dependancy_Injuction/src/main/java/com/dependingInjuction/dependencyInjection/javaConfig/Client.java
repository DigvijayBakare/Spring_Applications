package com.dependingInjuction.dependencyInjection.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        StudentInfo si = context.getBean("si", StudentInfo.class);
        StudentInfo si = context.getBean("temp", StudentInfo.class);
//        System.out.println(si);
        si.study();
    }
}
