package org.example.StrategyPattern.Objects;

import org.example.StrategyPattern.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SILENCE");
    }
}
