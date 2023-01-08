package com.apu.example.designpatterns.oop.solid.c_lsp;

/*
* Liskov substitution Principle (LSP)

This principle states that “Derived or child classes must be substitutable for their base or parent classes”.
In other words, if class A is a subtype of class B,
then we should be able to replace B with A without interrupting the behavior of the program.
*
*
* Here, if facebook, Instagram, and WhatsApp want to implements this social media class then it will violate the rule
* as Instagram could not not be replaced by social media as instagram does not support group video call.
*
* Same as for the WhatsApp, it does not support do post.
*
* Solution:
* To follow the lsp rule we have created three separate interface name
* 1. SocialMediaLSP
* 2. SocialPostAndMediaManagerLSP
* 3. VideoCallManagerLSP
*
* After that the implemented method will be specific and sub class could be replaced by super class
* For example Instagram implements both SocialMediaLSP and SocialPostAndMediaManagerLSP
* */
public abstract class SocialMedia {

    public abstract  void chatWithFriend();

    public abstract void publishPost(Object post);

    public abstract  void sendPhotosAndVideos();

    public abstract  void groupVideoCall(String... users);
}
