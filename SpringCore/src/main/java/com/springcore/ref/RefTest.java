package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A a = (A) context.getBean("aRef");
        System.out.println(a.getX());
        System.out.println(a.getB().getY());
        System.out.println(a);
    }
}
