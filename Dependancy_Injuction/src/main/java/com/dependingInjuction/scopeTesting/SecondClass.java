package com.dependingInjuction.scopeTesting;

public class SecondClass {
    private FirstClass firstClass;

    public SecondClass() {
    }

    public SecondClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public void secondClass() {
        System.out.println("This is second class's method!");
    }
}
