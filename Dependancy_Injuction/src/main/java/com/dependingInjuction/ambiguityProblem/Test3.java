package com.dependingInjuction.ambiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import javax.inject.Named;

@Configuration
@ComponentScan(basePackages = {"com.dependingInjuction.ambiguityProblem"})
public class Test3 {
    @Inject
    @Named("d1")
    private ABCD abcd;

    public void test() {
        abcd.method();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test3.class);
        ABCD bean = context.getBean("d1", ABCD.class);
        Test3 bean1 = context.getBean(Test3.class);

        bean.method();
        bean1.test();
    }
}

/// Here are using @Inject and @Named annotations to resolve the ambiguity problem