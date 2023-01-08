package com.apu.example.designpatterns.oop.solid.a_srp;

/*
Single Responsibility Principle
This principle states that “a class should have only one reason to change” which means every class should have a single responsibility
or single job or single purpose.


Look this class not following the above rule, for that we have to disintegrates the methods that are used for different purposes
For that we have created 3 services
1. LoanService
2. NotificationService
3. PrinterService
*
* */
public class BankService {
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    public void printPassbook() {
        //update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
