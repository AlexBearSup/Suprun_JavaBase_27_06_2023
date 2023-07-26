package ua.hillel.suprun.homeworks.homework11;

import java.util.Scanner;

public class Transp {

    public static void main(String[] args) {

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі. Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.


        int M = 0;
        int N = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків:");
        while (true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M <= 0) {
                    System.out.println("від'ємне значення або \"0\", будь-ласка введіть знову: ");
                    scanner.nextLine();
                } else {
                    break;
                }
                } else {
                System.out.println("помилкове значення (не число) , будь-ласка введіть знову: ");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Введіть кількість стовбців:");
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N <= 0) {
                    System.out.println("від'ємне значення або \"0\", будь-ласка введіть знову:");
                    scanner.nextLine();
                } else {
                    break;
                }
            } else {
                System.out.println("помилкове значення (не число) , будь-ласка введіть знову:");
                scanner.nextLine();
            }
        }

        int[][] arrayFirst = new int[M][N];
        int[][] arraySecond = new int[N][M];

        System.out.println();
        System.out.println("Початкова матриця:");
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arrayFirst[i].length; j++) {
                arrayFirst[i][j] = (int) (Math.random() * 101);
            }
        }
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arrayFirst[i].length; j++) {
                System.out.print(arrayFirst[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < arraySecond.length; i++) {
            for (int j = 0; j < arraySecond[i].length; j++) {
                arraySecond[i][j] = arrayFirst[j][i];
            }
        }
        for (int i = 0; i < arraySecond.length; i++) {
            for (int j = 0; j < arraySecond[i].length; j++) {
                System.out.print(arraySecond[i][j] + "\t");
            }
            System.out.println();
        }

    }


}
