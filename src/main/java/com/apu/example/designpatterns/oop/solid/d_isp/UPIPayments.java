package com.apu.example.designpatterns.oop.solid.d_isp;


/*
* Interface Segregation Principle (ISP)

This principle is the first principle that applies to Interfaces instead of classes in SOLID
and it is similar to the single responsibility principle.
It states that “do not force any client to implement an interface which is irrelevant to them“.

Problem:
Now let’s talk about few implementation for UPIPayments like Google Pay and Paytm.
Google Pay support these features so he can directly implement this UPIPayments
    but Paytm doesn’t support getCashBackAsCreditBalance() feature
    so here we shouldn’t force client paytm to override this method
    by implementating UPIPayments.

We need to segregate interface based on client need,
so to support this ISP we can design something like below

create a separate interface who will deal with Cashback
*
* */
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCreditBalance();
}
