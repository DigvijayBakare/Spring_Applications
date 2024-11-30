package com.beans.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigClass.class);
        Employee employee = (Employee) context.getBean("employee", Employee.class);
        System.out.println("Employee details: \n" + employee);
    }
}
