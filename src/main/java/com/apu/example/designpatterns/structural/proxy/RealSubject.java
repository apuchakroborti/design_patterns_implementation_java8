package com.apu.example.designpatterns.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public void method() {
        System.out.println("Actual implementation");
    }
}
