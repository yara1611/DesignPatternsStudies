package org.example.StrategyPattern.Objects;

import org.example.StrategyPattern.Behavior.FlyWithNoWings;
import org.example.StrategyPattern.Behavior.Quack;

//IS-A Duck
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior=new FlyWithNoWings();
        quackBehavior=new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
}
