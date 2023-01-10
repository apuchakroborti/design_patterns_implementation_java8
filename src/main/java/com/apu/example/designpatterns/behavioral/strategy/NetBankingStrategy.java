package com.apu.example.designpatterns.behavioral.strategy;

class NetBankingStrategy implements PaymentStrategy {
    private String bankName;
    private String accountNumber;
    private String accountHolderName;
    private String accountType;

    public NetBankingStrategy(String bankName, String accountNumber, String accountHolderName, String accountType){
        this.bankName=bankName;
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountType=accountType;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Net Banking.");
    }
}