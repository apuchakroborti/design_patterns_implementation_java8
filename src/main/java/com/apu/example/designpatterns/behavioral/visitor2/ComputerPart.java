package com.apu.example.designpatterns.behavioral.visitor2;

interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
