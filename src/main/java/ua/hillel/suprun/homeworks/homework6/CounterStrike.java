package ua.hillel.suprun.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введіть назву першої команди");
        String nameTeam1 = scanner.nextLine();

        System.out.println("введіть кількість фрагів гравця Boom ");
        int fragsBoom = 0;
        if (scanner.hasNextInt()) {
            fragsBoom = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця Little ");
        int fragsLittle = 0;
        if (scanner.hasNextInt()) {
            fragsLittle = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця Zeus ");
        int fragsZeus = 0;
        if (scanner.hasNextInt()) {
            fragsZeus = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця MVP ");
        int fragsMVP = 0;
        if (scanner.hasNextInt()) {
            fragsMVP = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }
        System.out.println("введіть кількість фрагів гравця Smile ");
        int fragsSmile = 0;
        if (scanner.hasNextInt()) {
            fragsSmile = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        scanner.nextLine();
        System.out.println("введіть назву другої команди");
        String nameTeam2 = scanner.nextLine();

        System.out.println("введіть кількість фрагів гравця Dendi ");
        int fragsDendi = 0;
        if (scanner.hasNextInt()) {
            fragsDendi = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця XBOCT ");
        int fragsXBOCT = 0;
        if (scanner.hasNextInt()) {
            fragsXBOCT = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця Puppey ");
        int fragsPuppey = 0;
        if (scanner.hasNextInt()) {
            fragsPuppey = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        System.out.println("введіть кількість фрагів гравця Solo ");
        int fragsSolo = 0;
        if (scanner.hasNextInt()) {
            fragsSolo = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }
        System.out.println("введіть кількість фрагів гравця Dread ");
        int fragsDread = 0;
        if (scanner.hasNextInt()) {
            fragsDread = scanner.nextInt();
        } else {
            System.out.println("помилкове значення, будь-ласка перезапустіть програму.");
            System.exit(0);
        }

        double pointsTeam1 = (fragsBoom + fragsLittle + fragsMVP + fragsZeus + fragsSmile) / 5d;
        double pointsTeam2 = (fragsDendi + fragsXBOCT + fragsPuppey + fragsSolo + fragsDread) / 5d;

        System.out.println();
        if (pointsTeam1 > pointsTeam2) {
            System.out.println("Перемогла команда " + nameTeam1 + ", яка набрала " + pointsTeam1 + " фрагів.");
        } else if (pointsTeam1 < pointsTeam2){
            System.out.println("Перемогла команда " + nameTeam2 + ", яка набрала " + pointsTeam2 + " фрагів.");
        } else {
            System.out.println("Кількість фрагів рівна, переможця не визначено !!! Потрібен додатковий раунд.");
        }


    }
}
