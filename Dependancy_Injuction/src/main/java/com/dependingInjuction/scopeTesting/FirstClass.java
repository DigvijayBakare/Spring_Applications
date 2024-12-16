package com.dependingInjuction.scopeTesting;

import org.springframework.context.annotation.Scope;

public class FirstClass {
    private SecondClass secondClass;

    public FirstClass() {
    }


    public FirstClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public void firstClass() {
        System.out.println("This is first class's method!!");
    }
}
