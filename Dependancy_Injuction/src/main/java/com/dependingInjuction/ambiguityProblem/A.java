package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("a1")
@Primary
//@Qualifier("a1")
public class A implements ABCD{
    @Override
    public void method() {
        System.out.println("Class A");
    }
}
