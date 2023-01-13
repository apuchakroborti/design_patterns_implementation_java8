package com.apu.example.designpatterns.structural.decorator;

/*
        *
        * You are correct, the doSomething() method of the ConcreteComponent class will be called first.

        In the decorator pattern, the decorator objects wrap the original object
        * and add new behavior by delegating the responsibility to the decorated object
        * and then adding their own behavior before or after the delegation.

        In this example, the doSomething() method of the ConcreteDecoratorB class is called first,
        * which delegates the responsibility to the decorated object (which is an instance of the ConcreteDecoratorA class).
        * The doSomething() method of the ConcreteDecoratorA class then delegates the responsibility to the decorated object
        * (which is an instance of the ConcreteComponent class).
        * Finally, the doSomething() method of the ConcreteComponent class is called,
        * which adds the behavior of "Doing something."
        *
        * */
public class DecoratorTestMain {
    public static void main(String[] args) {
        // Creating a concrete component
        Component component = new ConcreteComponent();

        // Creating a decorator A that wraps the concrete component
        Component decoratorA = new ConcreteDecoratorA(component);

        // Creating a decorator B that wraps the decorator A
        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        // Calling the doSomething() method on decorator B
        decoratorB.doSomething();
        // Output:
        // Doing something.
        // Doing something else before.
        // Doing something else after.


    }
}
