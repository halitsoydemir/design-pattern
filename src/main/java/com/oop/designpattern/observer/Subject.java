package com.oop.designpattern.observer;

import java.util.List;

/**
 * @author hltsydmr
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
