package ua.hillel.suprun.lessons.lesson12.animal;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    void gau(){
        System.out.println(name + " say gau-gau");
    }
}
