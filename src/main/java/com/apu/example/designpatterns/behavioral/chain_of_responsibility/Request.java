package com.apu.example.designpatterns.behavioral.chain_of_responsibility;

class Request {
    private String request;

    public Request(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    @Override
    public String toString() {
        return request;
    }
}

