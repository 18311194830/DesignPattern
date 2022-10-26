package Adapter.Impl;

import Adapter.AdvancedMediaPlayer;
import Adapter.MediaPlayer;
import Adapter.MediaPlayer2;

public class MediaAdapter2 extends MediaPlayer2 implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
