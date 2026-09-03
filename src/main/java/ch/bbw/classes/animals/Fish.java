package ch.bbw.classes.animals;

import javax.sound.sampled.SourceDataLine;

public class Fish extends Animal implements SoundMaking {

    protected Fish() {
        super(0);
    }

    @Override
    public boolean canLiveInWater() {
        return true;
    }

    @Override
    public boolean canLayEggs() {
        return true;
    }

    @Override
    public String makeSound() {
        return "blupp";
    }

    @Override
    public boolean isLoud() {
        return false;
    }
}
