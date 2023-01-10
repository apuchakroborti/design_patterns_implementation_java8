package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

// Abstract class for handling requests.
abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
            this.printHandling(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.println(this + " handling request \"" + request + "\"");
    }

    @Override
    public abstract String toString();
}