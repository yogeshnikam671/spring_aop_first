package com.example.spring_aop_first;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car {

    public void vroom() {
        System.out.println("vrooooom!!!!");
    }
}
