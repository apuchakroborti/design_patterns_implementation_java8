package com.apu.example.designpatterns.oop.solid.b_osp;

/*
* Open closed Principle (OSP)

This principle states that “software entities (classes, modules, functions, etc.) should be open for extension,
 but closed for modification” which means you should be able to extend a class behavior, without modifying it.
*
* Here by using this interface we can add any number of notification method without modifying the existing class, we can only do it by
* extending. for example we have added 3 types of notification methods like EmailNotification, MobileNotification, and WhatsAppNotification
* */
public interface NotificationService {
    public void sendOTP(String medium);
    public void sendTransactionNotification(String medium);
}
