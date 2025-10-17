package playlist;
import javax.sound.sampled.*;
import java.io.File;


public class playmusic {

    // Clip object for controlling audio playback
    private Clip audioClip;

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
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

            System.out.println("Audio file loaded successfully: " + filePath);
        } catch (Exception e) {
            System.out.println("Error loading audio: " + e.getMessage());
        }
    }

    public void play( String filePath ) {
        loadSound( filePath ) ;
        if (audioClip != null) {
            // Set playback position to the beginning (0)
            audioClip.setFramePosition(0);
            // Start looping continuously
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
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