package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

// Concrete handler 2
class RequestHandler2 extends RequestHandler {
    public RequestHandler2(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "RequestHandler2";
    }
}