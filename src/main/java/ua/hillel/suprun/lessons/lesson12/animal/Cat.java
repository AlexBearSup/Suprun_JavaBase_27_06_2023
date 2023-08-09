package ua.hillel.suprun.lessons.lesson12.animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }



    int countLive;

    void meow(){
        System.out.println(name + " say meow");
    }

    @Override
    void eat(){
        super.eat();
        meow();

    }

    @Override
    public String toString() {
        return "Cat{" +
                "countLive=" + countLive +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
