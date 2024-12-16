package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dependingInjuction.ambiguityProblem"})
public class Test1 {
    @Autowired
    @Qualifier("b1")
    private ABCD abcd;

    public void test() {
        abcd.method();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test1.class);
        ABCD bean = context.getBean("b1", ABCD.class);
        bean.method();
    }
}

/// Here we are using @Qualifier and @Component("name") annotations to solve the ambiguity problem