package com.apu.example.designpatterns.creational.factory;

import lombok.Data;

@Data
public class Engineer implements Profession{

    @Override
    public void print(){
        System.out.println("This is engineer");
    }
}
