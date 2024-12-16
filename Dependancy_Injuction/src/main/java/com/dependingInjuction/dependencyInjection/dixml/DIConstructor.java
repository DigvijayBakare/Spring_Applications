package com.dependingInjuction.dependencyInjection.dixml;

public class DIConstructor {
    private int id;
    private String name;

    public DIConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DIConstructor {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
