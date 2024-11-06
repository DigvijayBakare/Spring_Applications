package com.aop.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class AllAspects {

    @Before("execution(* com.aop.Impl.PaymentServiceImpl.makePayment(..))")
    public void printBefore() {
        System.out.println("Payment started..");
    }

    @After("execution(* com.aop.Impl.PaymentServiceImpl.makePayment(..))")
    public void printAfter() {
        System.out.println("Payment done..");
    }

    @AfterReturning("execution(* com.aop.Impl.PaymentServiceImpl.makePayment(..))")
    public void printAfterReturning() {
        System.out.println("After returning method");
    }

    @AfterThrowing("execution(* com.aop.Impl.PaymentServiceImpl.makePayment(..))")
    public void printAfterThrowing() {
        System.out.println("After throwing method");
    }

    /*@Around("execution(* com.aop.Impl.PaymentServiceImpl.makePayment(..))")
    public void printAround() {
        System.out.println("Around method");
    }*/
}
