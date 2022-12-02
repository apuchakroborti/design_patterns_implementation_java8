package com.apu.example.designpatterns.creational.factory;

public class ProfessionFactory {

    public Profession getProfession(String type){
        Profession profession = null;
       switch (type){
           case "Doctor":
               profession = new Doctor();
               break;
           case "Teacher":
               profession = new Teacher();
               break;
           case "Engineer":
               profession = new Engineer();
           default:
               break;
       }
        return profession;
    }
}
