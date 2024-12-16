package com.dependingInjuction.scopeTesting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        FirstClass firstClass1 = context.getBean("firstClass", FirstClass.class);
        FirstClass firstClass2 = context.getBean("firstClass", FirstClass.class);
        SecondClass secondClass1 = context.getBean("secondClass", SecondClass.class);
        SecondClass secondClass2 = context.getBean("secondClass", SecondClass.class);

        System.out.println(firstClass1.hashCode());
        System.out.println(firstClass2.hashCode());
        System.out.println(secondClass1.hashCode());
        System.out.println(secondClass2.hashCode());

//        firstClass1.firstClass();
//        secondClass.secondClass();
    }
}
