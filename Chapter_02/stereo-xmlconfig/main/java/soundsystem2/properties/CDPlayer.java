package soundsystem2.properties;

import org.springframework.beans.factory.annotation.Autowired;
import soundsystem2.CompactDisc;
import soundsystem2.MediaPlayer;


public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
