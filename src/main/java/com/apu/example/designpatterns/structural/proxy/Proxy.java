package com.apu.example.designpatterns.structural.proxy;

public class Proxy extends RealSubject{

    public void method(){
        System.out.println("This is proxy class, authentication and security checking will be done here");

        //TODO Logic to check if user is authentic or not. If yes then call real object
        //else no call
        System.out.println("Calling real method of real subject implementing class after the call is authenticated");
        super.method();



    }
}
