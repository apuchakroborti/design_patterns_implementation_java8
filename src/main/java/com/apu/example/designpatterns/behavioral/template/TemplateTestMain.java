package com.apu.example.designpatterns.behavioral.template;


/*
The Template Method design pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method,
called the template method, and allows subclasses to provide the implementation for one or more steps of the algorithm.
This allows you to define a common algorithm that can be reused by multiple subclasses,
while allowing each subclass to customize the algorithm as needed.

Here's an example of the Template Method pattern in Java:
* In this example, the Game class defines the template method play() that defines the skeleton of the algorithm for playing a game.
The play() method calls the following methods: initialize(), startPlay(), and endPlay().
These methods are defined as abstract in the Game class and need to be implemented by subclasses.

The Cricket and Football classes are subclasses of Game that provide the implementation for the steps of the algorithm defined in the template method.
They implement the initialize(), startPlay(), and endPlay() methods in a way that is specific to their respective games.

A client can use the pattern as following:

In this example, the client is able to use the template method play() to play a game,
regardless of the concrete implementation of the game,
by using the Game class as the super type, and it doesn't have to know
the concrete implementation of the game.
The Cricket and Football classes provide the specific implementation for each game,
and the play() method uses these implementations to execute the common algorithm for playing a game.

This way, the play() method provides a common interface for playing any game
and the concrete game classes provide the specific implementation for the game.
It allows you to reuse the common algorithm in multiple subclasses
and also allow customizing the algorithm according to the needs of the specific game.

Additionally, the template pattern allows you to change the common algorithm without affecting the subclasses,
this is because the common algorithm is defined in the super class,
and the subclasses only implement the specific parts of the algorithm.
This makes the code more flexible and easy to maintain.

It's worth noting that Java has abstract classes that can be used to implement the template pattern,
but it also has interface and Java 8 has default methods that you can use for creating a template method.
* */

public class TemplateTestMain {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();

    }
}
