package com.apu.example.designpatterns.structural.facade_computer;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory loading from the position: "+position+" data: "+data);

    }
}
