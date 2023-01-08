package com.apu.example.designpatterns.creational.singleton;

public class SingletonTestMain {

    public void testSingleton(){

        /*
        Here singletonTest1 and singletonTest2 both have same hashCode
        because of the single instance for both of the variables
        but
        singletonTestMain and singletonTestMain2 have different hashCode because both objects are different
        * */
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        singletonTest1.print();

        SingletonTest singletonTest2 = SingletonTest.getInstance();
        singletonTest2.print();


        SingletonTestMain singletonTestMain = new SingletonTestMain();
        System.out.println("singletonTestMain: "+singletonTestMain);

        SingletonTestMain singletonTestMain2 = new SingletonTestMain();
        System.out.println("singletonTestMain2: "+singletonTestMain2);
    }

    public static void main(String[] args) {
        new SingletonTestMain().testSingleton();
    }
}
