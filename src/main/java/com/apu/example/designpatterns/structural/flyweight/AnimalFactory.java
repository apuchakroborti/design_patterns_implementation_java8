package com.apu.example.designpatterns.structural.flyweight;

import java.util.HashMap;

public class AnimalFactory {
    private static final HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getCat(String name){
        String key = name + "-CAT";
        Animal animal = animalMap.get(key);

        if(animal!=null){
            return animal;
        } else {
            animal = new Cat();
            animal.setName(name);
            animalMap.put(key, animal);
        }
        return animal;
    }
}
