package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelConfig.xml");
        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);
    }
}
