package com.aop;

import com.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PaymentService payment = context.getBean("payment", PaymentService.class);
        payment.makePayment(15000);
    }
}
