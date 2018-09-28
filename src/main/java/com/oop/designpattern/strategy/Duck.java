package com.oop.designpattern.strategy;

/**
 * @author hltsydmr
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim(){}

    public abstract void display();
}

