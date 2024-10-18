package com.springcore.constructorInjection;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor : int, int");
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor : double, double");
    }
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor : String, String");
    }
    public void sum() {
        System.out.println("Value of a = " + this.a);
        System.out.println("Value of b = " + this.b);
        System.out.println("Sum = " + (this.a + this.b));
    }
}


// Ambiguity:
// If we don't have any constructor with string parameter then the bean will inject the values using the
// order of the constructor that is for up to down, but when we have String parameter constructor it will
// give the priority to that constructor and only use this constructor
// To solve this problem we have to explicitly give the type at the constructor-arg as type="int"

// To change the order of the value injection into the parameters give index="1" or as required