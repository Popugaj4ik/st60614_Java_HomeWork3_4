package lv.tsi.practice2.activity04;

public class Animal {
    private int age;

    public Animal(int age) {
        if(age>=0)
            this.age=age;
        else
            System.out.println("Age cannot be negative!");
    }

    public void setAge(int age){
        if(age>=0)
            this.age=age;
        else
            System.out.println("Age cannot be negative!");
    }

    public int getAge(){
        return this.age;
    }
}
