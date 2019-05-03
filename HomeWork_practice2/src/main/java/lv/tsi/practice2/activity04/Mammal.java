package lv.tsi.practice2.activity04;

public class Mammal extends Animal {
    private boolean isDomestic;

    public Mammal(int age, boolean isDomestic) {
        super(age);
        this.isDomestic = isDomestic;
    }

    public boolean getIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(boolean domestic) {
        isDomestic = domestic;
    }
}