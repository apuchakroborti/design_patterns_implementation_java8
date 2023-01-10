package com.apu.example.designpatterns.behavioral.iterator;

interface Collection {
    Iterator iterator();
    void add(Object item);
}
