package com.springcore.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTesting {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowiringconfigannotation.xml");
        Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1);
    }
}
