package com.apu.example.designpatterns.creational.abs_factory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String type){
        Profession profession = null;
        switch (type){
            case "Teacher":
                profession = new TraineeTeacher();
                break;
            case "Engineer":
                profession = new TraineeEngineer();
            default:
                break;
        }
        return profession;
    }
}
