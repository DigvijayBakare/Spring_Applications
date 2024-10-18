package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SchoolSubjects {
    private String subject;

    public SchoolSubjects() {
        super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "SchoolSubjects {subject = " + subject + "}";
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting method");
    }

    @PreDestroy
    public void end() {
        System.out.println("Ending method");
    }
}
