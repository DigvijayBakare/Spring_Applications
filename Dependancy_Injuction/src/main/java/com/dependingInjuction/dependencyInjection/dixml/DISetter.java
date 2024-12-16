package com.dependingInjuction.dependencyInjection.dixml;

public class DISetter {
    private int id;
    private String name;

    public DISetter() {
    }

    public DISetter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DISetter {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
