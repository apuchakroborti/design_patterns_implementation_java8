package com.apu.example.designpatterns.behavioral.command;

/*
* The Command design pattern is a behavioral design pattern that turns a request into a stand-alone object
* that contains all information about the request.
* This transformation lets you pass requests as method arguments,
* delay or queue a request’s execution, and support undoable operations.
*
* In this example, the Client class creates a Receiver object and two Command objects,
* command1 and command2, which are associated with the receiver.
* The Client also creates an Invoker object and sets the commands to be executed.
* When the invoke method is called, it executes the command.
*
* */
public class CommandTestMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.invoke();

        invoker.setCommand(command2);
        invoker.invoke();
    }
}
