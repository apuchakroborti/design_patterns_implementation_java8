package com.apu.example.designpatterns.behavioral.visitor;

class ConcreteElementB implements Element {
    private String value;

    public ConcreteElementB(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}