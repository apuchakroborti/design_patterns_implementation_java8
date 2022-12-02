package com.apu.example.designpatterns.creational.abs_factory;

public class ProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String type){
        Profession profession = null;
        switch (type){
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
