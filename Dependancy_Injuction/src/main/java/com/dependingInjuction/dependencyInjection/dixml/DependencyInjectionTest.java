package com.dependingInjuction.dependencyInjection.dixml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyInjection.xml");
        DIConstructor diConstructor = (DIConstructor) context.getBean("diC");
        System.out.println(diConstructor);

        DISetter diSetter = (DISetter) context.getBean("diS");
        System.out.println(diSetter);
    }
}
