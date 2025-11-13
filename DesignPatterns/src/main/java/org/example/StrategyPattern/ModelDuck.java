package org.example.StrategyPattern;

//IS-A Duck
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyWithNoWings();
        quackBehavior=new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
}
