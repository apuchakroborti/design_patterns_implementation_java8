package com.apu.example.designpatterns.creational.abs_factory;

public class AbsFactoryMainClass {
    public void testAbsFactory(){
        /*
        * Abstract factory similar as factory pattern but abstract factory has factory producer
        * Producer choose factory from a group of factory like Teacher, Engineer or Trainee Teacher, Engineer
        * */
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession engineer = abstractFactory.getProfession("Engineer");
        engineer.print();
    }
}
