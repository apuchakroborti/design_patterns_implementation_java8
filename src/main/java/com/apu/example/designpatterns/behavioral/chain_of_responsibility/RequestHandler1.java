package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

// Concrete handler 1
class RequestHandler1 extends RequestHandler {
    public RequestHandler1(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "RequestHandler1";
    }
}