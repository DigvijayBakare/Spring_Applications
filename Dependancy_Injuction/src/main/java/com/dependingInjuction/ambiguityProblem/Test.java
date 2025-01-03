package com.dependingInjuction.ambiguityProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dependingInjuction.ambiguityProblem"})
public class Test {
    @Autowired
    private ABCD abcd;

    public void test() {
        abcd.method();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        ABCD bean = context.getBean(ABCD.class);
        bean.method();
    }
}

///  This is done using @Primary annotation
