package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{122+84}")
    private int x;

    @Value("#{852-85}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double e;

    @Value("#{new java.lang.String('Digvijay')}")
    private String name;

    @Value("#{8>3}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
    }

}
