package lv.tsi.practice2.activity03;

public class Martian implements Alien, Humanoid, Cloneable {

    int weight;
    Object backpack;

    public Martian(int weight) {
        setWeight(weight);
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
    public void eatHuman(Humanoid humanoid) {
        if(humanoid.isAlive()!="Dead"){
            this.weight+=humanoid.getWeight();
            humanoid.killHimself();
        }
    }

    @Override
    public int getLegCount() {
        return LEG_COUNT;
    }

    @Override
    public Object getBackpack() {
        return backpack;
    }

    @Override
    public void setBackpack(Object item) {
        if(item!=null){
            backpack=item;
        }
    }

    @Override
    public String isAlive() {
        return "I AM IMMORTAL!";
    }

    @Override
    public String killHimself() {
        return "I AM IMMORTAL!";
    }

    @Override
    public int getArmCount() {
        return ARM_COUNT;
    }

    @Override
    public void setBackpack(String item) {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return clone(this);
    }

    private Object clone(Martian martian) {
        return martian;
    }

    @Override
    public String toString() {
        return "ClassName: " + weight + " [" + backpack + "]";
    }
}
