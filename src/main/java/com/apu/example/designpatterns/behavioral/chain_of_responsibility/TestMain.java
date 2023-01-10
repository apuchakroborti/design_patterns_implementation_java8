package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

/*
* The Chain of Responsibility design pattern allows you to pass requests along a dynamic chain of processors until one of them handles the request.
It can be used to implement a variety of solutions, including the creation of a support ticket system or an email system.
* In this example, the Client class sends requests to a chain of RequestHandler objects.
* The request is passed from one handler to the next until it is handled.
* Each RequestHandler object has a reference to the next handler in the chain, and the last handler has a null reference.
* */

public class TestMain {
    public static void main(String[] args) {
        // Setup chain of responsibility
        RequestHandler handler1 = new RequestHandler1(null);
        RequestHandler handler2 = new RequestHandler2(handler1);
        RequestHandler handler3 = new RequestHandler3(handler2);
        RequestHandler handler4 = new RequestHandler4(handler3);

        // Send requests to the chain
        handler2.handleRequest(new Request("Request 1"));
        handler2.handleRequest(new Request("Request 2"));

        handler3.handleRequest(new Request("Request 3"));
        handler4.handleRequest(new Request("Request 4"));


//        System.out.println(handler2.toString());
    }
}
