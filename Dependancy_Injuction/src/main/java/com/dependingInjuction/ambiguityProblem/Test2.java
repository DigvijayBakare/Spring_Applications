package com.dependingInjuction.ambiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dependingInjuction.ambiguityProblem"})
public class Test2 {

    private ABCD abcd;

    public void test() {
        abcd.method();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test2.class);
        ABCD bean = context.getBean("c1", ABCD.class);
        bean.method();
    }
}

/// Here we can directly solve the ambiguity problem just by specifying the name of the bean