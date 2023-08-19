package ua.hillel.suprun.homeworks.homework17;

import java.io.PushbackReader;
import java.util.Arrays;
import java.util.Scanner;

import static ua.hillel.suprun.homeworks.homework17.Drinks.*;

public class Main {
    public static void main(String[] args) {
        orderAndCoocking();
        System.out.println();
        System.out.println("Всього було замовлено напоїв у кількості - " + Drinks.counterDrink + "шт.");
        System.out.println("На загальну суму -  " + finalPrice + "$");


    }
    static void orderAndCoocking() {
        Cooking cookingSelected = new Cooking();

        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine userChoiсe = null;
        int userContinue = 1;

        while (userContinue == 1) {

            while (userChoiсe == null) {
                System.out.println("Ведіть напій з наявного списку:");
                System.out.println(Arrays.toString(drinksMachines));
                String userValue = scanner.nextLine().toUpperCase();
                for (DrinksMachine drinksMachine : drinksMachines) {
                    if (userValue.equals(drinksMachine.toString())) {
                        userChoiсe = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
            }

            switch (userChoiсe) {
                case TEA: {
                    cookingSelected.cooking(DrinksMachine.TEA);
                    finalPrice += PRICE_TEA;
                    break;
                }
                case COFFEE: {
                    cookingSelected.cooking(DrinksMachine.COFFEE);
                    finalPrice += PRICE_COFFEE;
                    break;
                }
                case LEMONADE: {
                    cookingSelected.cooking(DrinksMachine.LEMONADE);
                    finalPrice += PRICE_LEMONADE;
                    break;
                }
                case MOJITO: {
                    cookingSelected.cooking(DrinksMachine.MOJITO);
                    finalPrice += PRICE_MOJITO;
                    break;
                }
                case SODA: {
                    cookingSelected.cooking(DrinksMachine.SODA);
                    finalPrice += PRICE_SODA;
                    break;
                }
                case COLA: {
                    cookingSelected.cooking(DrinksMachine.COLA);
                    finalPrice += PRICE_COLA;
                    break;
                }
            }

            Drinks counterUserChoice = new Drinks();

            System.out.println("Якщо бажаєте ще один напій введіть цифру \"1\" , якщо ні, введіть будь-яку іншу цифру");
            while (true){
                if (scanner.hasNextInt()){
                    userContinue = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Будь ласка введіть число !");
                    scanner.nextLine();
                }
            }
            if (userContinue == 1){
                userChoiсe = null;
            }
            scanner.nextLine();

        }
    }



}
