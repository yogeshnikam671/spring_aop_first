package com.example.spring_aop_first;

import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike {

    // The methods here are called as JoinPoints which the PointCut cuts.
    // We can get the information about the JoinPoints inside PointCut methods (advices)
    // by directly injecting it as an argument (example can be found in Engine)

    public void vroom() {
        System.out.println("vroom!!");
    }

    public void crash() {
        System.out.println("crashed :(");
    }
}
