package com.apu.example.designpatterns.creational.factory;

import lombok.Data;

@Data
public class Doctor implements Profession{
    @Override
    public void print(){
        System.out.println("This is doctor");
    }
}
