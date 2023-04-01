package com.example.spring_aop_first;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopFirstApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.spring_aop_first");
        appContext.refresh();

        System.out.println("\n\n\n --------------------------------------");
        /*
            I want to basically start the engine before using any kind of vehicle, always.
            Starting the engine is my cross cutting concern in this particular example.
            We have achieved it by creating 'Engine' as an aspect.
            And configuring the Engine aspect to call one of its methods 'start' Before any 'vroom method'
            automatically
        */

        Bike bike = appContext.getBean("Bike", Bike.class);
        bike.vroom();


        Car car = appContext.getBean("Car", Car.class);
        car.vroom();
    }

}

