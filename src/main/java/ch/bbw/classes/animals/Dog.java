package ch.bbw.classes.animals;

public class Dog extends Animal implements SoundMaking{

    protected Dog() {
        super(4);
    }

    @Override
    public boolean canLiveInWater() {
        return false;
    }

    @Override
    public String makeSound() {
        return "WAU";
    }

    @Override
    public boolean isLoud() {
        return true;
    }


}
