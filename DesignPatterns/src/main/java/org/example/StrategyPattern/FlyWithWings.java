package org.example.StrategyPattern;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}
