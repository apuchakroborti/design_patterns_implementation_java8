package com.apu.example.designpatterns.behavioral.state;

class StopState implements State {
    public void doAction(){
        System.out.println("Player is in stop state");
    }
}