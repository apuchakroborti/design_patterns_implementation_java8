package com.apu.example.designpatterns.structural.facade_computer;

public class FacadeComputer {
    private Computer computer;

    public FacadeComputer() {
        this.computer = new Computer();
    }

    public void start() {
        computer.startComputer();
    }
}