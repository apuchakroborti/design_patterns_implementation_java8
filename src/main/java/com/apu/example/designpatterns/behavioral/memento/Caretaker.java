package com.apu.example.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// The Caretaker class
class Caretaker {
    private final List<Memento> mementoList = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}