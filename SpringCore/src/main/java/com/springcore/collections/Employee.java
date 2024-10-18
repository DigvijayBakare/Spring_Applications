package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String empName;
    private List<String> empPhones;
    private Set<String> empAddresses;
    private Map<String, String> courses;
    private Properties props;

    public Employee() {
        super();
    }

    public Employee(String empName, List<String> empPhones, Set<String> empAddresses, Map<String, String> courses, Properties props) {
        this.empName = empName;
        this.empPhones = empPhones;
        this.empAddresses = empAddresses;
        this.courses = courses;
        this.props = props;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getEmpPhones() {
        return empPhones;
    }

    public void setEmpPhones(List<String> empPhones) {
        this.empPhones = empPhones;
    }

    public Set<String> getEmpAddresses() {
        return empAddresses;
    }

    public void setEmpAddresses(Set<String> empAddresses) {
        this.empAddresses = empAddresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
