package com.apu.example.designpatterns.behavioral.visitor2;


/*
* Here's an example of the Visitor design pattern in Java,
* where we have an interface of ComputerPart,
* and Keyboard, Monitor, Mouse, Computer classes are the implementation of ComputerPart interface.
* And we have created a visitor interface ComputerPartVisitor, which have a method visit that accepts the part.
*
* In this example, the ComputerPart interface defines an accept() method that takes a visitor object as its argument.
* The Keyboard, Monitor, Mouse and Computer classes are implementation of ComputerPart interface
* and have the accept method that can accept the ComputerPartVisitor.

The ComputerPartVisitor is an interface, which has methods that accept each part of the computer.

In the ComputerPartDisplayVisitor class, implements the ComputerPartVisitor interface
* and it has the implementation of visit method for each parts, that print the message about displaying the computer part.

In the __main__ section, objects of Computer, Monitor, Mouse, Keyboard are created,
* and the visitor 'ComputerPartDisplayVisitor' is created.
* And finally accepts the visitors using the accept method of ComputerPart interface.

In this main method, we are creating an object of computer and passing the visitor to it using the accept method of Computer.
* Once the accept method is called,
* it traverse through each part of computer and call the visit method of ComputerPartVisitor for each part of the computer.

When you run the program, the output would be:
Displaying Mouse.
Displaying Keyboard.
Displaying Monitor.
Displaying Computer.

This demonstrates how the visitor pattern can be used in Java to separate the logic
* for displaying information about the parts of a computer from the classes that represent those parts,
* making it easy to add new functionality (like counting the number of parts or calculating the cost of the computer)
* without modifying the existing classes.
* */
public class VisitorTestMain2 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}









