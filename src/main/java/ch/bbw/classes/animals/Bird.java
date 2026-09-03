package ch.bbw.classes.animals;

public class Bird extends Animal{

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
}
