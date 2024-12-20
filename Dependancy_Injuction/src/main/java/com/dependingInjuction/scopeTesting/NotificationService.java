package com.dependingInjuction.scopeTesting;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class NotificationService {
    void show() {
        System.out.println("This is Notification service class");
    }

    @Lookup
    public AppNotification getAppNotification() {
        return new AppNotification();
    }
}
