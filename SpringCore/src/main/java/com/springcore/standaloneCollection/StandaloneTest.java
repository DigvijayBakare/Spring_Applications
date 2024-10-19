package com.springcore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");

        Person p1 = context.getBean("p1", Person.class);
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println(p1.getFeeStructure());
        System.out.println(p1.getFeeStructure().getClass().getName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println(p1.getProps());
        System.out.println(p1.getProps().getClass().getName());
    }
}
