package com.apu.example.designpatterns.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request");
    }
}
