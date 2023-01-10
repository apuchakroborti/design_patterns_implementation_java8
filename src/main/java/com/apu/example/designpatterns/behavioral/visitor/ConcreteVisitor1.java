package com.apu.example.designpatterns.behavioral.visitor;

class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("Visitor 1 is visiting Concrete Element A: " + element.getValue());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("Visitor 1 is visiting Concrete Element B: " + element.getValue());
    }
}