package com.oop.designpattern.observer;

/**
 * @author hltsydmr
 */
public class WeatherStationApp {

    public void run(){
        WeatherData subject = new WeatherData();
        WeatherDisplay wDisplay = new WeatherDisplay(subject);

        subject.setMeasurement(1,1,1);
        subject.setMeasurement(2,2,2);
        subject.setMeasurement(3,3,3);
    }

}
