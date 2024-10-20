package com.springcore.javaConfig;

import org.springframework.stereotype.Component;

//@Component("si")
public class StudentInfo {
    private Idli idli;

    public StudentInfo(Idli idli) {
        this.idli = idli;
    }

    public void study() {
        System.out.println("Student is reading a book!!");
        this.idli.display();
    }
}
