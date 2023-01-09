package com.apu.example.designpatterns.structural.decorator;

// A concrete decorator class
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        // Adding new behavior before delegating
        System.out.println("Doing something else before.");
    }
}