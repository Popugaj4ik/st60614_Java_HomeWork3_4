package lv.tsi.practice2.activity04;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(int age, boolean canFly) {
        super(age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
