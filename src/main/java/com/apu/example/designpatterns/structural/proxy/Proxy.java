package com.apu.example.designpatterns.structural.proxy;

public class Proxy extends RealSubject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        if (checkAccess()) {
            realSubject.request();
            logAccess();
        }
    }

    private boolean checkAccess() {
        System.out.println("Proxy: Checking access prior to firing a real request.");
        return true;
    }

    private void logAccess() {
        System.out.println("Proxy: Logging the time of request.");
    }
}
