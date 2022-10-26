package Adapter;

import Adapter.Impl.AudioPlayer;
import Adapter.Impl.MediaAdapter2;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        MediaAdapter2 mediaAdapter2 = new MediaAdapter2();
        mediaAdapter2.play("beyond the horizon.mp3");
        mediaAdapter2.playMp4("alone.mp4");
        mediaAdapter2.playVlc("far far away.vlc");
    }
}
