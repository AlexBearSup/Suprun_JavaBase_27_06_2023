package ua.hillel.suprun.homeworks.homework7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numberAI = (int)(Math.random() * 11);
//        System.out.println("number from AI = " + numberAI);
        int playerСhoice = -5;
        int numberOfAttempts = 4;

        System.out.println("guess the number from 0 to 10, you have" + " " + numberOfAttempts + " " + "attempts");

        for (int i = 0; i < numberOfAttempts; ) {
            System.out.print("your attempt # " + " " + (1 + i) + " " + ", number is = ");

            while (!scanner.hasNextInt()) {
                System.out.print("not number, please enter number from 0 to 10, so number is =");
                scanner.next();
            }
            if (scanner.hasNextInt()){
                playerСhoice = scanner.nextInt();

                if (playerСhoice == numberAI) {
                    System.out.println("you win !!!");
                    System.exit(0);
                } else if (playerСhoice < 0 || playerСhoice > 10) {
                    System.out.println("wrong (not 0 to 10), let`s again");
                    continue;
                } else {
                    System.out.println("wrong attempt");
                }
            }
            i++;
        }
        System.out.println("you lost this game, try again :)");

    }

}
