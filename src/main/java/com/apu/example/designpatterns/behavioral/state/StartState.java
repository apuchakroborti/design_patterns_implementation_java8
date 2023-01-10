package com.apu.example.designpatterns.behavioral.state;

class StartState implements State {
    public void doAction(){
        System.out.println("Player is in start state");
    }
}