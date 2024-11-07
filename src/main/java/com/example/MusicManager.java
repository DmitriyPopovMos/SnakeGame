package com.example;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicManager {

    public void playSounds1() {
        while (true) {
            try {
                File soundFile = new File("Марио.wav");
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.setFramePosition(0);
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 1000);

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void playSounds2() {
        while (true) {
            try {
                File soundFile = new File("DTsounds.wav");
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.setFramePosition(0);
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 1000);

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
