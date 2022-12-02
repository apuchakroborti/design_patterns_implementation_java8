package com.apu.example.designpatterns.creational.builder;

interface Builder {
    public void buildFloor();
    public void buildWalls();
    public void buildTerrace();

    public Home getComplexHomeObject();
}
