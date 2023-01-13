package com.apu.example.designpatterns.oop.solid.c_lsp;

public class LSPTestMain {
    public static void main(String[] args) {
//        Here Instagram subtype of SocialMediaLSP and it could be replaced by Instagram
        SocialMediaLSP socialMediaLSP = new InstagramLSP();
        socialMediaLSP.chatWithFriend();
        socialMediaLSP.sendPhotosAndVideos();

        SocialPostAndMediaManagerLSP socialPostAndMediaManagerLSP = new InstagramLSP();
        socialPostAndMediaManagerLSP.publishPost(new String("Test post"));
    }
}
