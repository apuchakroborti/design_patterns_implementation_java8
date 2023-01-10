package com.apu.example.designpatterns.behavioral.state;

/*
* The State design pattern is a behavioral design pattern that allows an object to change its behavior depending on its internal state, without modifying its class. It lets an object change its behavior when its internal state changes. The object appears to change its class.

Here's an example of the State pattern in Java:
* In this example, State interface defines the common interface for all concrete states, and concrete states are implemented as StartState, StopState, PlayState, PauseState, each one implements the doAction method that performs actions depending on the current state.

The Context class holds a reference to a state object, which represents the current state of the object, it holds a set and get method for the state.

A client can use the pattern as following:
* In this example, the context object starts in the StartState, then the client can change the internal state of the context by calling the setState method and passing the new state as an argument, this way the context object will change its behavior depending on the internal state, the client interacts only with the context object and the context object change its behavior internally without modifying its class.

The State pattern is useful when an object should change its behavior based on its internal state, but the number of states is large and changes frequently, it allows to encapsulate the behavior in separate classes and make the code more maintainable and scalable.
*
* */

public class StateTestMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction();

        context.setState(startState);
        context.getState().doAction();

        StopState stopState = new StopState();
        stopState.doAction();
        context.setState(stopState);
        context.getState().doAction();


    }
}
