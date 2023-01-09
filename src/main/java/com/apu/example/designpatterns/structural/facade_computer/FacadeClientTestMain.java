package com.apu.example.designpatterns.structural.facade_computer;


/*
* In this example, the FacadeComputer class acts as a facade for the complex subsystem of the Computer class.
* It provides a simplified interface for starting the computer by calling the start() method,
* which in turn calls the startComputer() method of the Computer class.

The Computer class represents the complex subsystem and has three internal components:
* the CPU, the Memory, and the HardDrive.
* It has a method, startComputer(), that performs the steps necessary to start the computer by interacting with these internal components.

The CPU, Memory, and HardDrive classes represent the low-level interfaces to the subsystem and contain the implementation details for their respective operations.

The Client class is the client code that uses the facade to access the subsystem.
* It creates an instance of the FacadeComputer class and calls the start() method to start the computer.
* The start() method in turn calls the startComputer() method of the Computer class to perform the necessary operations to start the computer.
*
* */
public class FacadeClientTestMain {
    public static void main(String[] args) {
        FacadeComputer facadeComputer = new FacadeComputer();
        facadeComputer.start();
    }
}
