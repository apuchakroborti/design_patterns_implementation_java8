package com.apu.example.designpatterns.behavioral.observer;

import com.apu.example.designpatterns.behavioral.observer.Observer;
import com.apu.example.designpatterns.behavioral.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/*
* In this example, the WeatherData class is the Subject
* and the CurrentConditionsDisplay class is the Observer.
* The WeatherData class maintains a list of Observers
* and notifies them whenever the weather measurements (temperature, humidity, and pressure) change.
*
* The CurrentConditionsDisplay class implements the update method of the Observer interface
* to receive notifications from the WeatherData Subject and it implements the display method
*
* */

// The WeatherData class is the Subject
class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}