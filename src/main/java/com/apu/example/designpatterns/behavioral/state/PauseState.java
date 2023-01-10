package com.apu.example.designpatterns.behavioral.state;

class PauseState implements State {
    public void doAction(){
        System.out.println("Player is in pause state");
    }
}