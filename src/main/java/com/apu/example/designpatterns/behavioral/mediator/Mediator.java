package com.apu.example.designpatterns.behavioral.mediator;

interface Mediator {
    void send(String message, Colleague colleague);
}