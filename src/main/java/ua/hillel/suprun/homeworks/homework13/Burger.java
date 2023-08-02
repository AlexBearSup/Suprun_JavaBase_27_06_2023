package ua.hillel.suprun.homeworks.homework13;

public class Burger {

    String bun;
    String beaf;
    String beaf2;
    String cheese;
    String greens;
    String mayo;

    Burger (String bun, String beaf, String cheese, String greens, String mayo){
        this.bun = bun;
        this.beaf = beaf;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("БУРГЕР \"ЗВИЧАЙНИЙ\"");
        System.out.println("- " + bun);
        System.out.println("- " + beaf);
        System.out.println("- " + cheese);
        System.out.println("- " + greens);
        System.out.println("- " + mayo);
    }

    Burger(String bun, String beaf, String cheese, String greens) {
        this.bun = bun;
        this.beaf = beaf;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("БУРГЕР \"ДІЄТИЧНИЙ\"");
        System.out.println("- " + bun);
        System.out.println("- " + beaf);
        System.out.println("- " + cheese);
        System.out.println("- " + greens);

    }

    public Burger(String bun, String beaf, String beaf2, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.beaf = beaf;
        this.beaf2 = beaf2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("БУРГЕР \"ПОДВІЙНИЙ\"");
        System.out.println("- " + bun);
        System.out.println("- " + beaf + " (подвійна !!)");
        System.out.println("- " + cheese);
        System.out.println("- " + greens);
        System.out.println("- " + mayo);
    }
}
