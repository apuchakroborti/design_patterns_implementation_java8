package com.apu.example.designpatterns.structural.adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        /*
        * In this example, the AudioPlayer class plays various audio formats using the MediaAdapter class
        * and the AdvancedMediaPlayer interface.
        * The MediaAdapter class implements the MediaPlayer interface
        * and delegates the handling of audio formats to the appropriate class (either VlcPlayer or Mp4Player).
        * This allows the AudioPlayer class to play audio.
        *
        *
        * In this example, the VlcPlayer and Mp4Player classes are the adaptees.
        *   They are the classes that need to be adapted to be used by the client (AudioPlayer).
        * The AdvancedMediaPlayer interface defines the methods that the adaptees need to implement,
        *   and the MediaAdapter class acts as the adapter, adapting the adaptees to the target interface (MediaPlayer)
        *   that the client expects. The client (AudioPlayer) is then able to use the adaptees through the adapter
        *   by calling the methods defined in the target interface.
        * */
    }
}