package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("c1")
//@Qualifier("c1")
public class C implements ABCD{
    @Override
    public void method() {
        System.out.println("Class C");
    }
}
