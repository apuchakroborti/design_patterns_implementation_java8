package com.apu.example.designpatterns.structural.flyweight;

public class Dog implements Animal {
    private String name =  null;

    public void setName(String name){
        this.name = name;
    }

    public void printAnimalAttribute(){
        System.out.println("Name of this animal is "+this.name);
        System.out.println("Number of eyes of this animal is "+CommonShareableClass.eyes);
        System.out.println("Number of legs of animal is "+CommonShareableClass.legs);
        System.out.println("Number of nose of this animal is "+CommonShareableClass.nose);
        System.out.println("Number of tail of this animal is "+CommonShareableClass.tail);
    }
}
