package com.apu.example.designpatterns.behavioral.memento;

/*
* Yes, it is correct to place the MementoImpl class inside the Originator class as an inner class.
* This is a common implementation of the Memento design pattern.

The Memento pattern typically consists of three objects: the Originator, the Memento, and the Caretaker.
* The Originator is the object whose state needs to be saved and restored.
* The Memento is an object that stores the state of the Originator.
* The Caretaker is an object that is responsible for storing and managing the Mementos.

In the Memento design pattern, the Memento should be an immutable object that stores the state of the Originator.
* The Memento should not allow the state to be modified once it has been set.
* To achieve this, the Memento can be implemented as an inner class of the Originator,
* with the state variables declared as final.
* This ensures that the state of the Memento cannot be modified, since the state variables are effectively private and final.

Placing the MementoImpl class inside the Originator class
* also has the advantage of allowing the Originator to have full control over the Memento class
* and its implementation, without exposing any implementation details to the Caretaker or other objects.
* This can be useful for protecting the encapsulation of the Originator's state.
*
*
* */
// The Originator class
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new MementoImpl(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

    // The Memento class
    private static class MementoImpl implements Memento {
        private final String state;

        private MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}

