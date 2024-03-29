package com.apu.example.designpatterns.behavioral.strategy;

import java.util.ArrayList;

class ShoppingCart {
    //List of items
    ArrayList<Item> items;
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum=0;
        for(Item item : items){
            sum+=item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}