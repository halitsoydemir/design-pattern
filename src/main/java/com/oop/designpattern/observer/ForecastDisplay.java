package com.oop.designpattern.observer;

/**
 * @author hltsydmr
 */
public class ForecastDisplay implements DisplayElement, Observer{
    private Subject subject;
    private int tomorrowH;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("ForecastDisplay tomorrow: %d%n", tomorrowH);
    }

    @Override
    public void update(int t,int h, int p) {
        this.tomorrowH = h+1;
        display();
    }
}
