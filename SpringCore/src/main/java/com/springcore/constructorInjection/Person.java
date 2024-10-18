package com.springcore.constructorInjection;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private Certi certi;
    private List<String> list;

    public Person(int id, String name, Certi certi, List<String> list) {
        this.id = id;
        this.name = name;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name + " {" + this.certi.name + "}" + "\n" + this.list;
    }
}
