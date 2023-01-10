package com.apu.example.designpatterns.behavioral.state;

class PlayState implements State {
    public void doAction(){
        System.out.println("Player is in play state");
    }
}