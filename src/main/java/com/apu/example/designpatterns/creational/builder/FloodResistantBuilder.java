package com.apu.example.designpatterns.creational.builder;

public class FloodResistantBuilder implements Builder{
    private Home floodResistantHome = new Home();

    @Override
    public void buildFloor() {
        this.floodResistantHome.setFloor("10 feets above ground level floor");
    }

    @Override
    public void buildWalls() {
        this.floodResistantHome.setWalls("Water resistant walls");
    }

    @Override
    public void buildTerrace() {
        this.floodResistantHome.setTerrace("Water leakage resistant terrace");
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistantHome;
    }
}
