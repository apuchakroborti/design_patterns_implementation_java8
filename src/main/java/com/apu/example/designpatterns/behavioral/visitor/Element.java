package com.apu.example.designpatterns.behavioral.visitor;

interface Element {
    void accept(Visitor visitor);
}
