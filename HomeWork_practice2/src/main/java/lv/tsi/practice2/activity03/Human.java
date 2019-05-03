package lv.tsi.practice2.activity03;

public class Human implements Humanoid {

    int weight;
    boolean isDead;
    String backpack;

    public Human() {
        setWeight(42);
        isDead=false;
    }

    public Human(int weight){
        setWeight(weight);
        isDead=false;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight=weight;
    }

    @Override
    public String killHimself() {
        isDead=true;
        return "Dead";
    }

    @Override
    public int getArmCount() {
        return ARM_COUNT;
    }

    @Override
    public String getBackpack() {

        return backpack;
    }

    @Override
    public void setBackpack(String item) {

    }

    @Override
    public String isAlive() {
        if(isDead!=true)
            return "Alive";
        else
            return "Dead";
    }
}
