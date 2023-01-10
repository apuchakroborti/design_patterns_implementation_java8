package com.apu.example.designpatterns.behavioral.strategy;

/*
In this example, the ShoppingCart class has a pay method that takes a PaymentStrategy as an argument.
* There are two implementations of the PaymentStrategy interface: CreditCardStrategy and NetBankingStrategy.
* These two classes implement the pay method in different ways to represent different ways of making a payment.
* By providing different implementations of the PaymentStrategy interface,
* the client code can change the behavior of the ShoppingCart's pay method at runtime.


* Sure, here's how you can finish the last code snippet:

Copy code
PaymentStrategy netBanking = new NetBankingStrategy("ICICI Bank", "123456789", "Pankaj Kumar", "Savings");
cart.pay(netBanking);
In this example, cart is an instance of the ShoppingCart class. The addItem method is used to add items to the cart, and the pay method is used to make the payment. The pay method takes an instance of the PaymentStrategy interface as an argument, which can be an instance of the CreditCardStrategy or NetBankingStrategy class.

When the pay method is called with the creditCard variable passed as an argument, it calls the pay method of the CreditCardStrategy class. Similarly, when the pay method is called with the netBanking variable passed as an argument, it calls the pay method of the NetBankingStrategy class.

This way the client code can choose which payment method it wants to use to make the payment, and the implementation of the payment logic is encapsulated within the CreditCardStrategy and NetBankingStrategy classes, allowing the client code to change the payment method easily without having to change its own code.
*
*
* */

public class StrategyTestMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("item 1", 10));
        cart.addItem(new Item("item 2", 40));

        PaymentStrategy creditCard = new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "789", "12/25");
        cart.pay(creditCard);

        PaymentStrategy netBanking = new NetBankingStrategy("ICICI Bank", "123456789", "Pankaj Kumar", "Savings");
        cart.pay(netBanking);


    }
}
