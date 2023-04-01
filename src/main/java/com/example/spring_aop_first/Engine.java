package com.example.spring_aop_first;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect // creates an aspect named Engine
@EnableAspectJAutoProxy // enables the aspect to be used in spring context
@Component
public class Engine {

    // Run this always before any method named vroom automatically
    @Before("execution(* vroom())")
    public void start() {
        System.out.println("Engine started...");
    }

}
