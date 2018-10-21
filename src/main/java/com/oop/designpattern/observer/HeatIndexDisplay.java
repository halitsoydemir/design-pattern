package com.oop.designpattern.observer;

/**
 * @author hltsydmr
 */
public class HeatIndexDisplay implements Observer,DisplayElement{
    String heatIndex;
    Subject subject;

    public HeatIndexDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("HeatIndexDisplay "+heatIndex);
    }

    @Override
    public void update(int t, int h, int p) {
        this.heatIndex = String.valueOf(t+h);
        display();
    }
}
