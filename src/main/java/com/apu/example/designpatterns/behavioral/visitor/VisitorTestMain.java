package com.apu.example.designpatterns.behavioral.visitor;

public class VisitorTestMain {
    public static void main(String[] args) {
        Element element1 = new ConcreteElementA("ElementA");
        Element element2 = new ConcreteElementA("ElementB");

        element1.accept(new ConcreteVisitor1());

        element2.accept(new ConcreteVisitor2());

    }
}
