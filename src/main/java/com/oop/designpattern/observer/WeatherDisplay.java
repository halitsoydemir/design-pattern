package com.oop.designpattern.observer;

/**
 * @author hltsydmr
 */
public class WeatherDisplay implements Observer,DisplayElement{
    private int temperature;
    private int humidty;
    private Subject subject;

    public WeatherDisplay(Subject s) {
        subject = s;
        s.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Weather Display "+temperature+","+humidty);
    }

    @Override
    public void update(int t, int h, int p) {
        this.temperature = t;
        this.humidty = h;
        display();
    }
}
