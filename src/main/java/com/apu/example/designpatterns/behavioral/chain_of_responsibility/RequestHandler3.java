package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

// Concrete handler 2
class RequestHandler3 extends RequestHandler {
    public RequestHandler3(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "RequestHandler3";
    }
}