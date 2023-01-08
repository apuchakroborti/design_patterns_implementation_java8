package com.apu.example.designpatterns.creational.builder;

interface Builder {
     void buildFloor();
     void buildWalls();
     void buildTerrace();
     Home getComplexHomeObject();
}
