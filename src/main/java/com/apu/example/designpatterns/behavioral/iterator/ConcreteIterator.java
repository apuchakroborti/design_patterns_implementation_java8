package com.apu.example.designpatterns.behavioral.iterator;

class ConcreteIterator implements Iterator {
    private ConcreteCollection collection;
    private int current = 0;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return current < collection.size();
    }

    @Override
    public Object next() {
        return collection.get(current++);
    }
}