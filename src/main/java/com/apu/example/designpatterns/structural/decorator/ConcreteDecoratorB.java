package com.apu.example.designpatterns.structural.decorator;

// Another concrete decorator class
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        // Adding new behavior after delegating
        System.out.println("Doing something else after.");
    }
}