package com.apu.example.designpatterns.behavioral.visitor;

interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
