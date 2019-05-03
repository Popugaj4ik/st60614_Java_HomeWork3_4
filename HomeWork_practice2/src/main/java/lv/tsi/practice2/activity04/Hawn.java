package lv.tsi.practice2.activity04;

public class Hawn extends Bird {
    private String color;

    public Hawn(int age, boolean canFly, String color) {
        super(age, canFly);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
