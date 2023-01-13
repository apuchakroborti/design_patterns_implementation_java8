package com.apu.example.designpatterns.structural.facade;



/*
*
* The Facade class acts as a single interface to a complex subsystem.
* It defines a higher-level interface that makes the subsystem easier to use.
* The client code can use the Facade to access the subsystem without having to know
* the details of the subsystem's implementation.

The Subsystem1, Subsystem2, and Subsystem3 classes represent the lower-level interfaces to the subsystem.
* They implement the subsystem's functionality and are used by the Facade to perform the operations requested by the client.

The Client class is the client code that uses the facade to access the subsystem.
It calls the methods of the Facade, which in turn call the methods of the subsystem classes to perform the desired operations.
*/

public class ClientMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
