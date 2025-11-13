package org.example.StrategyPattern.Objects;

import org.example.StrategyPattern.Behavior.FlyWithWings;
import org.example.StrategyPattern.Behavior.Quack;

//IS-A Duck
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}

