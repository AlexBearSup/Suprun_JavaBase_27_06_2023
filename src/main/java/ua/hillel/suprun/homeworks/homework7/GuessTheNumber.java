package ua.hillel.suprun.homeworks.homework7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numberAI = (int)(Math.random() * 11);
        System.out.println("number from AI = " + numberAI);
        int playerСhoice = -5;
        int numberOfAttempts = 4;

        System.out.println("guess the number from 0 to 10, you have 5 attempts");

        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.print("your attempt # " + " " + (1+i) + " " + ", number is = ");

            while (!scanner.hasNextInt()) {
                System.out.print("wrong data, please enter number from 0 to 10, so number is =");
                scanner.next();
            }
            if (scanner.hasNextInt()){
                playerСhoice = scanner.nextInt();

                if (playerСhoice == numberAI && playerСhoice >= 0 && playerСhoice <= 10) {
                    System.out.println("you win !!!");
                    System.exit(0);
                } else {
                    System.out.println("wrong");
                }
            }
        }
        System.out.println("you lost this game");

    }

}
