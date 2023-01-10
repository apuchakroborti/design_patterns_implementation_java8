package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

// Concrete handler 2
class RequestHandler4 extends RequestHandler {
    public RequestHandler4(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "RequestHandler4";
    }
}