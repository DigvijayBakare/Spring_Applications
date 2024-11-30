package com.beans.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMovie {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movies movie = (Movies) context.getBean(Movies.class);
        System.out.println("Movie's information: \n" + movie);
    }
}
