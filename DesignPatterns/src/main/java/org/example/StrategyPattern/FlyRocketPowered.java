package org.example.StrategyPattern;


public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Rocket flying");
    }
}
