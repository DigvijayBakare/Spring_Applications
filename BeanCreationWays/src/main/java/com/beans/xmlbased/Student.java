package com.beans.xmlbased;

public class Student {
    private String name;
    private String address;
    private String rollNo;

    public Student(String name, String address, String rollNo) {
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
