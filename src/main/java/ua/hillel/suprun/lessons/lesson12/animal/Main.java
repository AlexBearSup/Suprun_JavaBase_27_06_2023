package ua.hillel.suprun.lessons.lesson12.animal;

public class Main {
    public static void main(String[] args) {

        Cat cat =new Cat("Barsi=k", 7);
        cat.countLive = 9;

        Dog dog = new Dog("Sharik", 9);

        cat.eat();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(cat);
//        cat.meow();

//        System.out.println(cat.getAge());
//
//
//        Dog dog = new Dog();
//        dog.name = "Sharik";
//        dog.gau();
//
//        ChildCat childCat = new ChildCat();




    }



}
