package com.apu.example.designpatterns.oop.solid.e_dip;

public class CreditCardDIP implements BankCardDIP{
    public void doTransaction(int amount){
        System.out.println("tx done with CreditCard");
    }
}
