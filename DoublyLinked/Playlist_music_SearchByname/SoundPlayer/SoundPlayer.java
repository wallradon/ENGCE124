package SoundPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SoundPlayer {

    // Clip object for controlling audio playback
    private Clip audioClip ;

    /**
     * Load audio file
     * 
     * @param filePath Path to the audio file (e.g., "path/to/your/song.wav")
     */
    public void loadSound(String filePath) {
        File audioFile = new File(filePath);

        if (!audioFile.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile) ;
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

            System.out.println("Audio file loaded successfully: " + filePath);
        } catch (Exception e) {
            System.out.println("Error loading audio: " + e.getMessage());
        }
    }

    public void play() {
        if (audioClip != null) {
            // Set playback position to the beginning (0)
            audioClip.setFramePosition(0);
            // Start looping continuously
            audioClip.start() ;
            // audioClip.start(); // If you want to play only once
            System.out.println("Playing audio...");
        } else {
            System.out.println("No audio file loaded");
        }
    }

    public void stop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
            System.out.println("Audio stopped");
        } else if (audioClip != null) {
            System.out.println("Audio is not currently playing");
        }
    }

    public void close() {
        if (audioClip != null) {
            audioClip.close();
        }
    }

}

    // --- เมธอด main สำหรับทดสอบการทำงาน ---
    public static void main(String[] args) {
        SoundPlayer player = new SoundPlayer();
        Scanner scanner = new Scanner(System.in);
        String filePath = "C:\\Users\\MIN\\Downloads\\Music\\Three Man Down-lovemusic.wav"; // **เปลี่ยนชื่อไฟล์ตามไฟล์
                                                                                            // .wav ที่คุณมี**

        // 1. โหลดเพลง
        // ตรวจสอบให้แน่ใจว่าไฟล์ 'song.wav' อยู่ในโฟลเดอร์เดียวกันกับ SoundPlayer.java
        player.loadSound(filePath);

        // 2. ควบคุมการเล่น
        System.out.println("\nคำสั่ง:");
        System.out.println("  P: Play");
        System.out.println("  S: Stop");
        System.out.println("  E: Exit");

        String command;
        do {
            System.out.print("enter (P/S/E): ");
            command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "P":
                    player.play();
                    break;
                case "S":
                    player.stop();
                    break;
                case "E":
                    System.out.println("Exitttt");
                    break;
                default:
                    System.out.println("Try agin");
            }
        } while (!command.equals("E"));

        // 3. ปิดทรัพยากรเมื่อจบ
        player.close();
        scanner.close();
    }
}