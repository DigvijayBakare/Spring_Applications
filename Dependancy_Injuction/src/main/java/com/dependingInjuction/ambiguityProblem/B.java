package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("b1")
//@Qualifier("b1")
public class B implements ABCD{
    @Override
    public void method() {
        System.out.println("Class B");
    }
}
