package com.dependingInjuction.scopeTesting;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AppNotification {
    void show() {
        System.out.println("This is Application notification class");
    }
}
