package com.apu.example.designpatterns.behavioral.template;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    //this method can not be override so that it is a fixed rule
    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}