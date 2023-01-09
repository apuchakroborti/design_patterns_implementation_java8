package com.apu.example.designpatterns.structural.decorator;

// The concrete component class
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        // The original behavior
        System.out.println("Doing something.");
    }
}