package org.example.StrategyPattern.Behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SQUEAK");
    }
}
