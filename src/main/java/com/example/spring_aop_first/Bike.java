package com.example.spring_aop_first;

import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike {

    public void vroom() {
        System.out.println("vroom!!");
    }

    public void crash() {
        System.out.println("crashed :(");
    }
}
