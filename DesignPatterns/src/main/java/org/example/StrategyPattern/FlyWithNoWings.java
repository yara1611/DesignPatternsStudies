package org.example.StrategyPattern;

public class FlyWithNoWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}
