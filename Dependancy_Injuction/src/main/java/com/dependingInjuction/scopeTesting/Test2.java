package com.dependingInjuction.scopeTesting;

import com.dependingInjuction.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dependingInjuction.scopeTesting"})
public class Test2 {
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private AppNotification appNotification;
    public static void main(String[] args) {
        // @Lookup: Indicates a method as a lookup method. It is best used for injecting a
        // prototype-scoped bean into a singleton bean.

        ApplicationContext context = new AnnotationConfigApplicationContext(Test2.class);
        NotificationService bean = context.getBean(NotificationService.class);
        System.out.println(bean);
        bean.show();
        bean.getAppNotification().show();
    }
}
