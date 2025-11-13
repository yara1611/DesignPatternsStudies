package org.example.StrategyPattern.Behavior;


public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket flying");
    }
}
