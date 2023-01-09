package com.apu.example.designpatterns.behavioral.observer;


// The Subject interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
