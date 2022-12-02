package com.apu.example.designpatterns.creational.singleton;

public class SingletonTest {
    public static SingletonTest singletonTestInstance = new SingletonTest();

    private SingletonTest(){

    }

    public static SingletonTest getInstance(){
        return singletonTestInstance;
    }
    public void print(){
        System.out.println("Singleton class object created: "+ singletonTestInstance);
    }
}
