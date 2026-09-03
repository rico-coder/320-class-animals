package ch.bbw.classes.animals;

public class Dog extends Animal {

    protected Dog() {
        super(4);
    }

    @Override
    public boolean canLiveInWater() {
        return false;
    }
}
