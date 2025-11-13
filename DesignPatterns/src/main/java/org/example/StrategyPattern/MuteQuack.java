package org.example.StrategyPattern;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SILENCE");
    }
}
