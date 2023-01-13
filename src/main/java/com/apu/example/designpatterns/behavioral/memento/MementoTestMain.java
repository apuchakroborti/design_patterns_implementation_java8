package com.apu.example.designpatterns.behavioral.memento;

/*
       * In this example, the Originator class is the object whose state we want to save and restore.
       * The Caretaker class is responsible for storing the Memento objects that capture the state of the Originator.
       * The Memento interface defines the contract for creating and accessing the stored state of the Originator.
       * The MementoImpl class is the concrete implementation of the Memento interface.

       To save the state of the Originator, the saveStateToMemento method is called,
       *which creates a new MementoImpl object and stores the current state of the Originator inside it.
       * The MementoImpl object is then passed to the Caretaker object, which adds it to a list of Memento objects.

       To restore the state of the Originator, the Caretaker object retrieves the desired Memento object from its list
       * and passes it to the Originator object's getStateFromMemento method.
       * This method extracts the stored state from the Memento object and sets it as the current state of the Originator.

       In this way, the Memento design pattern allows you to capture
       * and restore the state of an object without violating the principle of encapsulation.
       * The Originator object's internal state is hidden from the Caretaker object,
       * which can only manipulate the state through the use of Memento objects.
       *
       * */
public class MementoTestMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());


    }
}
