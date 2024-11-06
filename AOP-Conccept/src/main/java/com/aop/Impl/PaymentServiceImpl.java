package com.aop.Impl;

import com.aop.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment(int amount) {
        // payment code
        System.out.println(amount + " Payment method!!");
    }
}
