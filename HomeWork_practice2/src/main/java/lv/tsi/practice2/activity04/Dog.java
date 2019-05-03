package lv.tsi.practice2.activity04;

public class Dog extends Mammal {

    private String name;

    public Dog(int age, boolean isDomestic, String name) {
        super(age, isDomestic);
        this.name = name;
    }

    public void setName(String name) {
        if (Character.isUpperCase(name.charAt(0)) == true)
            this.name = name;
        else
            System.out.println("First letter need to be Capital");
    }

    public String getName() {
        return name;
    }
}
