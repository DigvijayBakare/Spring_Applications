package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("d1")
//@Qualifier("d1")
public class D implements ABCD{
    @Override
    public void method() {
        System.out.println("Class D");
    }
}
