package com.apu.example.designpatterns.structural.facade_computer;

public class CPU {
    public void freeze() {
        System.out.println("CPU freeze...");
    }
    public void jump(long position) {
        System.out.println("CPU jump position: "+position);
    }
    public void execute() {
        System.out.println("CPU execution is in progress...");
    }
}