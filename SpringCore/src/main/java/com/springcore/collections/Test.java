package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "collectionConfig.xml");
        Employee employee = (Employee) context.getBean("emp1");

        System.out.println(employee.getEmpName());
        System.out.println(employee.getEmpPhones());
        System.out.println(employee.getEmpAddresses());
        System.out.println(employee.getCourses());
        System.out.println(employee.getProps());
        System.out.println(employee.getEmpPhones().getClass().getName());
    }
}
