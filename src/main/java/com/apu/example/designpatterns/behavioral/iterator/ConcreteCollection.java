package com.apu.example.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

class ConcreteCollection implements Collection {
    private List<Object> items = new ArrayList<>();

    public void add(Object item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}