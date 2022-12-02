package com.apu.example.designpatterns.creational.abs_factory;

import lombok.Data;

@Data
public class Engineer implements Profession {

    @Override
    public void print(){
        System.out.println("This is abs factory engineer");
    }
}
