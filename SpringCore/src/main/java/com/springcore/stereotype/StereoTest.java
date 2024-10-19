package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student student = context.getBean("ob", Student.class);
        System.out.println(student);
        System.out.println(student.getAddresses());
        System.out.println(student.getAddresses().getClass().getName());

        // Singleton bean scope checking: it will return single object every time we request to the bean
        // creating new object for checking if it is returning the same object or not
        Student student1 = context.getBean("ob", Student.class);

        // checking the hashcode of both the objects for the equality
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        // testing the scope configuration through the xml file configuration
        Teacher t1 = context.getBean("teacher", Teacher.class);
        Teacher t2 = context.getBean("teacher", Teacher.class);

        // checking hashcode
        System.out.println("Hashcode of teacher 1: " + t1.hashCode());
        System.out.println("Hashcode of teacher 2: " + t2.hashCode());
    }
}
