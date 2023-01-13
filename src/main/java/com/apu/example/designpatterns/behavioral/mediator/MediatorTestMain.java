package com.apu.example.designpatterns.behavioral.mediator;

/*
* The Mediator design pattern is a behavioral design pattern that allows you to define a separate object,
* called a mediator, that coordinates communication between other objects in a program.
* This allows you to reduce the number of dependencies between objects
* and promote loose coupling, which makes it easier to add new types of objects
* and change the communication patterns between them.

Here's an example of the Mediator pattern in Java:
In this example, the Mediator interface defines a single method, send(message, colleague),
that allows an object to send a message to another object through the mediator.

* The Colleague abstract class defines an object that can communicate with other objects through a mediator.
* The ConcreteColleagueA and ConcreteColleagueB classes are specific implementations of the Colleague class.

The ConcreteMediator class implements the Mediator interface and coordinates communication between ConcreteColleagueA
* and ConcreteColleagueB. It contains references to both objects and implements the logic for forwarding messages between them.
*
*
In this example, colleagueA sends a message "How are you?" to colleagueB through the mediator, mediator.
* colleagueB receives the message and prints it out. Then, colleagueB sends a message "Fine, thanks" to colleagueA
* through the mediator, and colleagueA receives the message and prints it out.

Because the ConcreteColleagueA and ConcreteColleagueB classes have no direct references to each other,
and can only communicate through the mediator, this promotes loose coupling between them.
This makes it easy to add new types of colleagues or change the communication patterns between existing colleagues without
having to change the existing code.

By abstracting the communication between the objects,
the Mediator pattern allows to reduce complexity and make the code more maintainable and extendable.
*
* */

public class MediatorTestMain {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("How are you?");
        colleagueB.send("Fine, thanks");
    }
}
