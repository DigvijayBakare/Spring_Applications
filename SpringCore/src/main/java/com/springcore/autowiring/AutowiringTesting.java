package com.springcore.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTesting {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowiringconfig.xml");
        Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1);
    }
}
