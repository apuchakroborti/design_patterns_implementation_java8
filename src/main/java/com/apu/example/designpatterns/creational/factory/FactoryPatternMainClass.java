package com.apu.example.designpatterns.creational.factory;

public class FactoryPatternMainClass {

    public void testFactoryPatternMain(){
        //Here I am creating objects using factory class
        // I am passing the name of eh objects only and getting the object
        // but I don't know how the object is created
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession profession = professionFactory.getProfession("Doctor");
        profession.print();

        profession = professionFactory.getProfession("Teacher");
        profession.print();

        profession = professionFactory.getProfession("Engineer");
        profession.print();
    }
}
