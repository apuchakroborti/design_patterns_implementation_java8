package com.apu.example.designpatterns.behavioral.observer;


/*
* The Observer design pattern is useful in a variety of situations:

1. When an object's state changes, and other objects need to be notified of the change.
2. When an object needs to be able to publish updates to its state,
*  and other objects need to subscribe to receive these updates.
3. When an object has a one-to-many relationship with other objects,
* and you want to be able to notify all the objects about a change in the state of the first object.

* Some common examples of where the Observer design pattern is used include:

A weather data provider that publishes updates about the current temperature, humidity, and pressure
* to subscribed weather displays.
A stock ticker that publishes updates about the latest stock prices to subscribed stock traders.
A chat application that allows users to subscribe to updates from specific chat rooms or conversations.
In general, the Observer design pattern is a good choice when you need to maintain consistency between related objects without
* making the objects tightly coupled
*
* */


public class ObserverTestMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
