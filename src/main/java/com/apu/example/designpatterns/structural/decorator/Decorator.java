package com.apu.example.designpatterns.structural.decorator;

// The decorator class
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        // Delegating the responsibility to the decorated component
        component.doSomething();
    }
}
