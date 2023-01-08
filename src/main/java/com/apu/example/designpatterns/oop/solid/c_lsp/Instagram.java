package com.apu.example.designpatterns.oop.solid.c_lsp;


public class Instagram implements SocialMediaLSP , SocialPostAndMediaManagerLSP {
    public void chatWithFriend(){
        //logic
        System.out.println("Chatting with friends!");
    }
    public void sendPhotosAndVideos(){
        //logic
        System.out.println("Sending Photos and videos!");

    }
    public void publishPost(Object post){
        //logic
        System.out.println("Publishing posts!"+post.toString());
    }
}
