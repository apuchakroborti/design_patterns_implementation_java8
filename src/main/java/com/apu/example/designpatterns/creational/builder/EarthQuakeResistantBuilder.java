package com.apu.example.designpatterns.creational.builder;

public class EarthQuakeResistantBuilder implements Builder{

    private Home earthQuakeResistantHome = new Home();

    @Override
    public void buildFloor() {
        this.earthQuakeResistantHome.setFloor("Wooden floor");
    }

    @Override
    public void buildWalls() {
        this.earthQuakeResistantHome.setWalls("Wooden walls");
    }

    @Override
    public void buildTerrace() {
        this.earthQuakeResistantHome.setTerrace("Wooden terrace");
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthQuakeResistantHome;
    }
}
