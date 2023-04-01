package com.example.spring_aop_first;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect // creates an aspect named Engine
@EnableAspectJAutoProxy // enables the aspect to be used in spring context
@Component
public class Engine {

    // Run this always before any method named vroom automatically
    // Such methods are basically referred to as Advice in AOP
    @Before("execution(* vroom())")
    public void start() {
        System.out.println("Engine started...");
    }

    @After("crashPointCut()")
    public void stop(JoinPoint joinPoint) {
        System.out.println("Engine stopped... " + joinPoint.getTarget().getClass().getSimpleName());
    }


    // PointCut is basically the execution expression that we define over advices.
    // PointCuts are useful when you want to use the same execution expression at different places.
    @Pointcut("execution(* crash())")
    public void crashPointCut() {}

}
