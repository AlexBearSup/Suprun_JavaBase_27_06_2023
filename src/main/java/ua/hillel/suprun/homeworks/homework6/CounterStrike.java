package ua.hillel.suprun.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name of the first team");
        String nameTeam1 = scanner.nextLine();

        System.out.println("enter the number of frags Boom ");
        int fragsBoom = 0;
        if (scanner.hasNextInt()) {
            fragsBoom = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags Little ");
        int fragsLittle = 0;
        if (scanner.hasNextInt()) {
            fragsLittle = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags Zeus ");
        int fragsZeus = 0;
        if (scanner.hasNextInt()) {
            fragsZeus = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags MVP ");
        int fragsMVP = 0;
        if (scanner.hasNextInt()) {
            fragsMVP = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }
        System.out.println("enter the number of frags Smile ");
        int fragsSmile = 0;
        if (scanner.hasNextInt()) {
            fragsSmile = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        scanner.nextLine();
        System.out.println("enter the name of the second team");
        String nameTeam2 = scanner.nextLine();

        System.out.println("enter the number of frags Dendi ");
        int fragsDendi = 0;
        if (scanner.hasNextInt()) {
            fragsDendi = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags XBOCT ");
        int fragsXBOCT = 0;
        if (scanner.hasNextInt()) {
            fragsXBOCT = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags Puppey ");
        int fragsPuppey = 0;
        if (scanner.hasNextInt()) {
            fragsPuppey = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        System.out.println("enter the number of frags Solo ");
        int fragsSolo = 0;
        if (scanner.hasNextInt()) {
            fragsSolo = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }
        System.out.println("enter the number of frags Dread ");
        int fragsDread = 0;
        if (scanner.hasNextInt()) {
            fragsDread = scanner.nextInt();
        } else {
            System.out.println("Incorrect value, please start again ");
            System.exit(0);
        }

        double pointsTeam1 = (fragsBoom + fragsLittle + fragsMVP + fragsZeus + fragsSmile) / 5;
        double pointsTeam2 = (fragsDendi + fragsXBOCT + fragsPuppey + fragsSolo + fragsDread) / 5;

        if (pointsTeam1 > pointsTeam2) {
            System.out.println("Перемогла команда" + nameTeam1 + ", яка набрала " + pointsTeam1 + "фрагів.");
        } else {
            System.out.println("Перемогла команда" + nameTeam2 + ", яка набрала " + pointsTeam2 + "фрагів.");
        }









    }
}
