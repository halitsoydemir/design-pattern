package com.oop.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hltsydmr
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private int temperature;
    private int humidty;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(temperature,humidty,pressure);
        }
    }

    int getTemperature(){
        return this.temperature;
    }

    int getHumidty(){
        return this.humidty;
    }

    int getPressure(){
        return this.pressure;
    }

    void measurementschanged(){
        notifyObservers();
    }

    public void setMeasurement(int t,int h,int p){
        this.temperature=t;
        this.humidty=h;
        this.pressure=p;
        measurementschanged();
    }
}
