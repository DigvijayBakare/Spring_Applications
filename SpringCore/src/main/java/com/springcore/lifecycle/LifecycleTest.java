package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("samosaConfig.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("samosaConfig.xml");
//        Samosa s1 = (Samosa) context.getBean("s1");
//        System.out.println(s1);
//
//        // registering shutdown hook
//        context.registerShutdownHook();
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        Pepsi p1 = (Pepsi) context.getBean("p1");
//        System.out.println(p1);
        context.registerShutdownHook();

//        System.out.println("******************************************************");
        SchoolSubjects ss = (SchoolSubjects) context.getBean("ss1");
        System.out.println(ss);
    }
}
