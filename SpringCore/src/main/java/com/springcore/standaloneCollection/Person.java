package com.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feeStructure;
    private Properties props;


    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person [friends = " + friends + ", feeStructure = " + feeStructure + "]";
    }
}
