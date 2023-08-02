package ua.hillel.suprun.lessons.lesson11;

public class Main {

    public static void main(String[] args) {

        Person alex = new Person();

        alex.age = 30;
        alex.name = "alex";

        System.out.println(alex.age);
        System.out.println(alex.name);

        Person den = new Person();

        den.age = 29;
        den.name = "den";

        System.out.println(den.age);
        System.out.println(den.name);

    }
}
