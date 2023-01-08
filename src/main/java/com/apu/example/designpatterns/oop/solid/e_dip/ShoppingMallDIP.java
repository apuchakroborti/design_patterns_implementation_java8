package com.apu.example.designpatterns.oop.solid.e_dip;

/*
* To follow DIP rule we have created the BankCardDIP interface
* CreditCardDIP and DebitCardDIP will implement the BnkCardDIP and
* we can use any type of card from ShoppingMallDIP class
*
* Here BankCardDIP, CreditCardDIP, and DebitCardDIP depend on the abstraction
**/


public class ShoppingMallDIP {
    private BankCardDIP bankCard;
    public ShoppingMallDIP(BankCardDIP bankCard) {
        this.bankCard = bankCard;
    }
    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }
    public static void main(String[] args) {
        BankCardDIP bankCard=new CreditCardDIP();
        ShoppingMallDIP shoppingMall=new ShoppingMallDIP(bankCard);
        shoppingMall.doPayment("do some order", 10000);
    }
}
