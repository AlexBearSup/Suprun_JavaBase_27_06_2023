package ua.hillel.suprun.homeworks.homework13;

import java.sql.SQLOutput;

public class BurgerMain {

    public static void main(String[] args) {

        Burger regularBurger = new Burger("Булочка з кужутом","Котлета з яловичини","Твердий сир","Листя салату","Соус \"Бургер\"");
        System.out.println();
        Burger dietBurger = new Burger("Булочка з кужутом","Котлета куряча","Сир \"Чедер\"","Листя салату");
        System.out.println();
        Burger doubleBurger = new Burger("Булочка з кужутом","Котлета з яловичини", "Котлета з яловичини","Мікс твердих сирів","Листя салату","Соус \"Бургер\"");

    }

}
