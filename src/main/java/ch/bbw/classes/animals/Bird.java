package ch.bbw.classes.animals;

public class Bird extends Animal implements SoundMaking{

    protected Bird() {
        super(2);
    }

    @Override
    public boolean canLiveInWater() {
        return false;
    }

    @Override
    public boolean canLayEggs() {
        return true;
    }

    @Override
    public String makeSound() {
        return "pips";
    }

    @Override
    public boolean isLoud() {
        return false;
    }
}
