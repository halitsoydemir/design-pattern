package com.oop.designpattern.observer.java;

import java.util.Observable;

/**
 * @author hltsydmr
 */
public class WeatherData extends Observable{
    private int temperature;
    private int humidty;
    private int pressure;

    public WeatherData() {
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(int t, int h, int p){
        this.temperature = t;
        this.humidty = h;
        this.pressure = p;
        measurementChanged();
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

}
