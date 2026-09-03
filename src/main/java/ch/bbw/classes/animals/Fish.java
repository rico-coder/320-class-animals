package ch.bbw.classes.animals;

public class Fish extends Animal{

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
}
