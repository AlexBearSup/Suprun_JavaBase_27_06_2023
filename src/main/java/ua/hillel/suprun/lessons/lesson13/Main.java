package ua.hillel.suprun.lessons.lesson13;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        Dog dog = new Dog();

        demoWorkAbs(cat);
        demoWorkAbs(dog);

//        cat.run();
//        dog.run();

    }

    static void demoWorkAbs(Animal animal){
        animal.run();

    }


}
