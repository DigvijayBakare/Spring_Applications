package com.beans.javaconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private String email;
    private int eId;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", eId='" + eId + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String name, String email, int eId) {
        this.name = name;
        this.email = email;
        this.eId = eId;
    }

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }
}
