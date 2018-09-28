package com.oop.designpattern.strategy;

/**
 * @author hltsydmr
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {

    }
}
