package com.apu.example.designpatterns.oop.solid.a_srp;

public class NotificationService {


    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
