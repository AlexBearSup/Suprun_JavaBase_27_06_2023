package ua.hillel.suprun.homeworks.practics;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] pole = new char[3][3];
//        int[][] pole = new int[3][3];
        char zero = 9711;
        char cross = 10005;
        int number = 0;
        System.out.println("Ігрове поле, де кожній комірці відповідає число:");
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = '_';
                number += 1;
                System.out.print(number + "." + pole[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("введіть у яку комірку ставимо хрестик (введіть число від 1 до 9)");
        Scanner scanner = new Scanner(System.in);
        int cross1 = 0;
        while (true){
            if (scanner.hasNextInt()) {
                cross1 = scanner.nextInt();
                if (cross1 <= 0 || cross1 > 9) {
                    System.out.println("Ви ввели число поза діапазоном 1-9, спробуйте знову");
                    scanner.nextLine();
                } else {
                    break;
                }
            }
            else {
                System.out.println("Ви ввели не число, спробуйте знову");
                scanner.nextLine();
            }
        }
                if (cross1 == 1) {
                    pole[0][0] = cross;
                } else if (cross1 == 2) {
                    pole[0][1] = cross;
                } else if (cross1 == 3) {
                    pole[0][2] = cross;
                } else if (cross1 == 4) {
                    pole[1][0] = cross;
                } else if (cross1 == 5) {
                    pole[1][1] = cross;
                } else if (cross1 == 6) {
                    pole[1][2] = cross;
                } else if (cross1 == 7) {
                    pole[2][0] = cross;
                } else if (cross1 == 8) {
                    pole[2][1] = cross;
                }else {
                    pole[2][2] = cross;
                }
        number = 1;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Хід комп'ютера:");

        int null1 = 5;
        if (cross1 == null1){
            null1 = (int) (1 + Math.random() * 9);
            while (true){
                if (null1 == 1 || null1 == 3 || null1 == 7 || null1 == 9 ){
                    break;
                } else {
                    null1 = (int) (1 + Math.random() * 9);
                }
            }
        }
        System.out.println(null1);

        if (null1 == 1) {
            pole[0][0] = zero;
        } else if (null1 == 2) {
            pole[0][1] = zero;
        } else if (null1 == 3) {
            pole[0][2] = zero;
        } else if (null1 == 4) {
            pole[1][0] = zero;
        } else if (null1 == 5) {
            pole[1][1] = zero;
        } else if (null1 == 6) {
            pole[1][2] = zero;
        } else if (null1 == 7) {
            pole[2][0] = zero;
        } else if (null1 == 8) {
            pole[2][1] = zero;
        }else {
            pole[2][2] = zero;
        }
        number = 1;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }



        // hod # 2
        System.out.println();
        System.out.println("Ваш хід №2:");
        int cross2 = 0;
        while (true){
            if (scanner.hasNextInt()) {
                cross2 = scanner.nextInt();
                if (cross2 <= 0 || cross2 > 9 || cross2 == cross1 || cross2 == null1) {
                    System.out.println("Ви ввели число поза діапазоном 1-9 або число вже зайнятої комірки, спробуйте знову");
                    scanner.nextLine();
                } else {
                    break;
                }
            }
            else {
                System.out.println("Ви ввели не число, спробуйте знову");
                scanner.nextLine();
            }
        }
        if (cross2 == 1) {
            pole[0][0] = cross;
        } else if (cross2 == 2) {
            pole[0][1] = cross;
        } else if (cross2 == 3) {
            pole[0][2] = cross;
        } else if (cross2 == 4) {
            pole[1][0] = cross;
        } else if (cross2 == 5) {
            pole[1][1] = cross;
        } else if (cross2 == 6) {
            pole[1][2] = cross;
        } else if (cross2 == 7) {
            pole[2][0] = cross;
        } else if (cross2 == 8) {
            pole[2][1] = cross;
        }else {
            pole[2][2] = cross;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }

        System.out.println();
        int null2 = 0;
        System.out.println("Хід комп'ютера № 2:");
        if (pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == '_'){
            null2 = 7;
        } else if (pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == '_'){
            null2 = 9;
        } else if (pole[0][1] == zero && pole[0][2] == zero && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == '_'){
            null2 = 8;
        } else if (pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == '_'){
            null2 = 7;
        } else if (pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == '_'){
            null2 = 9;
        } else if (pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == '_'){
            null2 = 6;
        } else if (pole[1][0] == zero && pole[2][0] == zero && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[1][1] == zero && pole[1][2] == zero && pole[1][0] == '_'){
            null2 = 4;
        } else if (pole[1][1] == zero && pole[2][0] == zero && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[1][1] == zero && pole[2][1] == zero && pole[0][1] == '_'){
            null2 = 2;
        } else if (pole[1][1] == zero && pole[2][2] == zero && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[1][2] == zero && pole[2][2] == zero && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[0][0] == zero && pole[0][2] == zero && pole[0][1] == '_') {
            null2 = 2;
        } else if (pole[1][0] == zero && pole[1][2] == zero && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[2][0] == zero && pole[2][2] == zero && pole[2][1] == '_') {
            null2 = 8;
        } else if (pole[0][0] == zero && pole[2][0] == zero && pole[1][0] == '_') {
            null2 = 4;
        } else if (pole[0][1] == zero && pole[2][1] == zero && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][2] == zero && pole[2][2] == zero && pole[1][2] == '_') {
            null2 = 6;
        } else if (pole[0][0] == zero   && pole[2][2] == zero && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][2] == zero && pole[2][0] == zero && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == '_'){
            null2 = 7;
        } else if (pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == '_'){
            null2 = 9;
        } else if (pole[0][1] == cross && pole[0][2] == cross && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == '_'){
            null2 = 8;
        } else if (pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == '_'){
            null2 = 7;
        } else if (pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == '_'){
            null2 = 9;
        } else if (pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == '_'){
            null2 = 6;
        } else if (pole[1][0] == cross && pole[2][0] == cross && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[1][1] == cross && pole[1][2] == cross && pole[1][0] == '_'){
            null2 = 4;
        } else if (pole[1][1] == cross && pole[2][0] == cross && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[1][1] == cross && pole[2][1] == cross && pole[0][1] == '_'){
            null2 = 2;
        } else if (pole[1][1] == cross && pole[2][2] == cross && pole[0][0] == '_'){
            null2 = 1;
        } else if (pole[1][2] == cross && pole[2][2] == cross && pole[0][2] == '_'){
            null2 = 3;
        } else if (pole[0][0] == cross && pole[0][2] == cross && pole[0][1] == '_') {
            null2 = 2;
        } else if (pole[1][0] == cross && pole[1][2] == cross && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[2][0] == cross && pole[2][2] == cross && pole[2][1] == '_') {
            null2 = 8;
        } else if (pole[0][0] == cross && pole[2][0] == cross && pole[1][0] == '_') {
            null2 = 4;
        } else if (pole[0][1] == cross && pole[2][1] == cross && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][2] == cross && pole[2][2] == cross && pole[1][2] == '_') {
            null2 = 6;
        } else if (pole[0][0] == cross && pole[2][2] == cross && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][2] == cross && pole[2][0] == cross && pole[1][1] == '_') {
            null2 = 5;
        } else if (pole[0][0]  == '_') {
            null2 = 1;
        } else if (pole[0][1]  == '_') {
            null2 = 2;
        } else if (pole[0][2]  == '_') {
            null2 = 3;
        } else if (pole[1][0]  == '_') {
            null2 = 4;
        } else if (pole[1][1]  == '_') {
            null2 = 5;
        } else if (pole[1][2]  == '_') {
            null2 = 6;
        } else if (pole[2][0]  == '_') {
            null2 = 7;
        } else if (pole[2][1]  == '_') {
            null2 = 8;
        } else if (pole[2][2]  == '_') {
            null2 = 9;
        } else {
            System.out.println("mb ne vse");
        }
        System.out.println(null2);

        if (null2 == 1) {
            pole[0][0] = zero;
        } else if (null2 == 2) {
            pole[0][1] = zero;
        } else if (null2 == 3) {
            pole[0][2] = zero;
        } else if (null2 == 4) {
            pole[1][0] = zero;
        } else if (null2 == 5) {
            pole[1][1] = zero;
        } else if (null2 == 6) {
            pole[1][2] = zero;
        } else if (null2 == 7) {
            pole[2][0] = zero;
        } else if (null2 == 8) {
            pole[2][1] = zero;
        }else {
            pole[2][2] = zero;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }



        // hod # 3
        System.out.println();
        System.out.println("Ваш хід № 3");
        int cross3 = 0;
        while (true){
            if (scanner.hasNextInt()) {
                cross3 = scanner.nextInt();
                if (cross3 <= 0 || cross3 > 9 || cross3 == cross2 || cross3 == cross1 || cross3 == null1 || cross3 == null2 ) {
                    System.out.println("Ви ввели число поза діапазоном 1-9 або число вже зайнятої комірки, спробуйте знову");
                    scanner.nextLine();
                } else {
                    break;
                }
            }
            else {
                System.out.println("Ви ввели не число, спробуйте знову");
                scanner.nextLine();
            }
        }
        if (cross3 == 1) {
            pole[0][0] = cross;
        } else if (cross3 == 2) {
            pole[0][1] = cross;
        } else if (cross3 == 3) {
            pole[0][2] = cross;
        } else if (cross3 == 4) {
            pole[1][0] = cross;
        } else if (cross3 == 5) {
            pole[1][1] = cross;
        } else if (cross3 == 6) {
            pole[1][2] = cross;
        } else if (cross3 == 7) {
            pole[2][0] = cross;
        } else if (cross3 == 8) {
            pole[2][1] = cross;
        }else {
            pole[2][2] = cross;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }

        System.out.println();

        int null3 = 0;
        System.out.println("Хід комп'ютера № 3:");
        if (pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == '_'){
            null3 = 7;
        } else if (pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == '_'){
            null3 = 9;
        } else if (pole[0][1] == zero && pole[0][2] == zero && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == '_'){
            null3 = 8;
        } else if (pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == '_'){
            null3 = 7;
        } else if (pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == '_'){
            null3 = 9;
        } else if (pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == '_'){
            null3 = 6;
        } else if (pole[1][0] == zero && pole[2][0] == zero && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[1][1] == zero && pole[1][2] == zero && pole[1][0] == '_'){
            null3 = 4;
        } else if (pole[1][1] == zero && pole[2][0] == zero && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[1][1] == zero && pole[2][1] == zero && pole[0][1] == '_'){
            null3 = 2;
        } else if (pole[1][1] == zero && pole[2][2] == zero && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[1][2] == zero && pole[2][2] == zero && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[0][0] == zero && pole[0][2] == zero && pole[0][1] == '_') {
            null3 = 2;
        } else if (pole[1][0] == zero && pole[1][2] == zero && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[2][0] == zero && pole[2][2] == zero && pole[2][1] == '_') {
            null3 = 8;
        } else if (pole[0][0] == zero && pole[2][0] == zero && pole[1][0] == '_') {
            null3 = 4;
        } else if (pole[0][1] == zero && pole[2][1] == zero && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][2] == zero && pole[2][2] == zero && pole[1][2] == '_') {
            null3 = 6;
        } else if (pole[0][0] == zero   && pole[2][2] == zero && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][2] == zero && pole[2][0] == zero && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == '_'){
            null3 = 7;
        } else if (pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == '_'){
            null3 = 9;
        } else if (pole[0][1] == cross && pole[0][2] == cross && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == '_'){
            null3 = 8;
        } else if (pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == '_'){
            null3 = 7;
        } else if (pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == '_'){
            null3 = 9;
        } else if (pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == '_'){
            null3 = 6;
        } else if (pole[1][0] == cross && pole[2][0] == cross && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[1][1] == cross && pole[1][2] == cross && pole[1][0] == '_'){
            null3 = 4;
        } else if (pole[1][1] == cross && pole[2][0] == cross && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[1][1] == cross && pole[2][1] == cross && pole[0][1] == '_'){
            null3 = 2;
        } else if (pole[1][1] == cross && pole[2][2] == cross && pole[0][0] == '_'){
            null3 = 1;
        } else if (pole[1][2] == cross && pole[2][2] == cross && pole[0][2] == '_'){
            null3 = 3;
        } else if (pole[0][0] == cross && pole[0][2] == cross && pole[0][1] == '_') {
            null3 = 2;
        } else if (pole[1][0] == cross && pole[1][2] == cross && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[2][0] == cross && pole[2][2] == cross && pole[2][1] == '_') {
            null3 = 8;
        } else if (pole[0][0] == cross && pole[2][0] == cross && pole[1][0] == '_') {
            null3 = 4;
        } else if (pole[0][1] == cross && pole[2][1] == cross && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][2] == cross && pole[2][2] == cross && pole[1][2] == '_') {
            null3 = 6;
        } else if (pole[0][0] == cross && pole[2][2] == cross && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][2] == cross && pole[2][0] == cross && pole[1][1] == '_') {
            null3 = 5;
        } else if (pole[0][0]  == '_') {
            null3 = 1;
        } else if (pole[0][1]  == '_') {
            null3 = 2;
        } else if (pole[0][2]  == '_') {
            null3 = 3;
        } else if (pole[1][0]  == '_') {
            null3 = 4;
        } else if (pole[1][1]  == '_') {
            null3 = 5;
        } else if (pole[1][2]  == '_') {
            null3 = 6;
        } else if (pole[2][0]  == '_') {
            null3 = 7;
        } else if (pole[2][1]  == '_') {
            null3 = 8;
        } else if (pole[2][2]  == '_') {
            null3 = 9;
        } else {
            System.out.println("mb ne vse");
        }
        System.out.println(null3);

        if (null3 == 1) {
            pole[0][0] = zero;
        } else if (null3 == 2) {
            pole[0][1] = zero;
        } else if (null3 == 3) {
            pole[0][2] = zero;
        } else if (null3 == 4) {
            pole[1][0] = zero;
        } else if (null3 == 5) {
            pole[1][1] = zero;
        } else if (null3 == 6) {
            pole[1][2] = zero;
        } else if (null3 == 7) {
            pole[2][0] = zero;
        } else if (null3 == 8) {
            pole[2][1] = zero;
        }else {
            pole[2][2] = zero;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }

        if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == cross ||
                pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == cross ||
                pole[2][0] == cross && pole[2][1] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == cross ||
                pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == cross ||
                pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == cross ||
                pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == cross) {
            System.out.println("Ви перемогли, Вітаю !!!");
            System.exit(0);
        } else if ( pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == zero ||
                pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == zero ||
                pole[2][0] == zero && pole[2][1] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == zero ||
                pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == zero ||
                pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == zero ||
                pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == zero){
            System.out.println("Нажаль, премога за комп'ютером");
            System.exit(0);
        }


        // hod # 4
        System.out.println("Ваш хід № 4");
        int cross4 = 0;
        while (true){
            if (scanner.hasNextInt()) {
                cross4 = scanner.nextInt();
                if (cross4 <= 0 || cross4 > 9 || cross4 == cross3 || cross4 == cross2 || cross4 == null3 || cross4 == null2 || cross4 == cross1 || cross4 == null1 ) {
                    System.out.println("Ви ввели число поза діапазоном 1-9 або число вже зайнятої комірки, спробуйте знову");
                    scanner.nextLine();
                } else {
                    break;
                }
            }
            else {
                System.out.println("Ви ввели не число, спробуйте знову");
                scanner.nextLine();
            }
        }
        if (cross4 == 1) {
            pole[0][0] = cross;
        } else if (cross4 == 2) {
            pole[0][1] = cross;
        } else if (cross4 == 3) {
            pole[0][2] = cross;
        } else if (cross4 == 4) {
            pole[1][0] = cross;
        } else if (cross4 == 5) {
            pole[1][1] = cross;
        } else if (cross4 == 6) {
            pole[1][2] = cross;
        } else if (cross4 == 7) {
            pole[2][0] = cross;
        } else if (cross4 == 8) {
            pole[2][1] = cross;
        }else {
            pole[2][2] = cross;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }

        System.out.println();


        if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == cross ||
                pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == cross ||
                pole[2][0] == cross && pole[2][1] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == cross ||
                pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == cross ||
                pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == cross ||
                pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == cross) {
            System.out.println("Ви перемогли, Вітаю !!!");
            System.exit(0);
        } else if ( pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == zero ||
                pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == zero ||
                pole[2][0] == zero && pole[2][1] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == zero ||
                pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == zero ||
                pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == zero ||
                pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == zero){
            System.out.println("Нажаль, премога за комп'ютером");
            System.exit(0);
        }

        int null4 = 0;
        System.out.println("Хід комп'ютера № 4:");


        if (pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == '_'){
            null4 = 7;
        } else if (pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == '_'){
            null4 = 9;
        } else if (pole[0][1] == zero && pole[0][2] == zero && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == '_'){
            null4 = 8;
        } else if (pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == '_'){
            null4 = 7;
        } else if (pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == '_'){
            null4 = 9;
        } else if (pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == '_'){
            null4 = 6;
        } else if (pole[1][0] == zero && pole[2][0] == zero && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[1][1] == zero && pole[1][2] == zero && pole[1][0] == '_'){
            null4 = 4;
        } else if (pole[1][1] == zero && pole[2][0] == zero && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[1][1] == zero && pole[2][1] == zero && pole[0][1] == '_'){
            null4 = 2;
        } else if (pole[1][1] == zero && pole[2][2] == zero && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[1][2] == zero && pole[2][2] == zero && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[0][0] == zero && pole[0][2] == zero && pole[0][1] == '_') {
            null4 = 2;
        } else if (pole[1][0] == zero && pole[1][2] == zero && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[2][0] == zero && pole[2][2] == zero && pole[2][1] == '_') {
            null4 = 8;
        } else if (pole[0][0] == zero && pole[2][0] == zero && pole[1][0] == '_') {
            null4 = 4;
        } else if (pole[0][1] == zero && pole[2][1] == zero && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][2] == zero && pole[2][2] == zero && pole[1][2] == '_') {
            null4 = 6;
        } else if (pole[0][0] == zero   && pole[2][2] == zero && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][2] == zero && pole[2][0] == zero && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == '_'){
            null4 = 7;
        } else if (pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == '_'){
            null4 = 9;
        } else if (pole[0][1] == cross && pole[0][2] == cross && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == '_'){
            null4 = 8;
        } else if (pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == '_'){
            null4 = 7;
        } else if (pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == '_'){
            null4 = 9;
        } else if (pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == '_'){
            null4 = 6;
        } else if (pole[1][0] == cross && pole[2][0] == cross && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[1][1] == cross && pole[1][2] == cross && pole[1][0] == '_'){
            null4 = 4;
        } else if (pole[1][1] == cross && pole[2][0] == cross && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[1][1] == cross && pole[2][1] == cross && pole[0][1] == '_'){
            null4 = 2;
        } else if (pole[1][1] == cross && pole[2][2] == cross && pole[0][0] == '_'){
            null4 = 1;
        } else if (pole[1][2] == cross && pole[2][2] == cross && pole[0][2] == '_'){
            null4 = 3;
        } else if (pole[0][0] == cross && pole[0][2] == cross && pole[0][1] == '_') {
            null4 = 2;
        } else if (pole[1][0] == cross && pole[1][2] == cross && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[2][0] == cross && pole[2][2] == cross && pole[2][1] == '_') {
            null4 = 8;
        } else if (pole[0][0] == cross && pole[2][0] == cross && pole[1][0] == '_') {
            null4 = 4;
        } else if (pole[0][1] == cross && pole[2][1] == cross && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][2] == cross && pole[2][2] == cross && pole[1][2] == '_') {
            null4 = 6;
        } else if (pole[0][0] == cross && pole[2][2] == cross && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][2] == cross && pole[2][0] == cross && pole[1][1] == '_') {
            null4 = 5;
        } else if (pole[0][0]  == '_') {
            null4 = 1;
        } else if (pole[0][1]  == '_') {
            null4 = 2;
        } else if (pole[0][2]  == '_') {
            null4 = 3;
        } else if (pole[1][0]  == '_') {
            null4 = 4;
        } else if (pole[1][1]  == '_') {
            null4 = 5;
        } else if (pole[1][2]  == '_') {
            null4 = 6;
        } else if (pole[2][0]  == '_') {
            null4 = 7;
        } else if (pole[2][1]  == '_') {
            null4 = 8;
        } else if (pole[2][2]  == '_') {
            null4 = 9;
        } else {
            System.out.println("mb ne vse");
        }
        System.out.println(null4);

        if (null4 == 1) {
            pole[0][0] = zero;
        } else if (null4 == 2) {
            pole[0][1] = zero;
        } else if (null4 == 3) {
            pole[0][2] = zero;
        } else if (null4 == 4) {
            pole[1][0] = zero;
        } else if (null4 == 5) {
            pole[1][1] = zero;
        } else if (null4 == 6) {
            pole[1][2] = zero;
        } else if (null4 == 7) {
            pole[2][0] = zero;
        } else if (null4 == 8) {
            pole[2][1] = zero;
        }else  {
            pole[2][2] = zero;
        }
        number = 1;
        System.out.println();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(number + "." + pole[i][j] + "\t");
                number++;
            }
            System.out.println();
        }

        if (pole[0][0] == cross && pole[0][1] == cross && pole[0][2] == cross ||
                pole[1][0] == cross && pole[1][1] == cross && pole[1][2] == cross ||
                pole[2][0] == cross && pole[2][1] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][0] == cross && pole[2][0] == cross ||
                pole[0][1] == cross && pole[1][1] == cross && pole[2][1] == cross ||
                pole[0][2] == cross && pole[1][2] == cross && pole[2][2] == cross ||
                pole[0][0] == cross && pole[1][1] == cross && pole[2][2] == cross ||
                pole[0][2] == cross && pole[1][1] == cross && pole[2][0] == cross) {
            System.out.println("Ви перемогли, Вітаю !!!");
            System.exit(0);
        } else if ( pole[0][0] == zero && pole[0][1] == zero && pole[0][2] == zero ||
                pole[1][0] == zero && pole[1][1] == zero && pole[1][2] == zero ||
                pole[2][0] == zero && pole[2][1] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][0] == zero && pole[2][0] == zero ||
                pole[0][1] == zero && pole[1][1] == zero && pole[2][1] == zero ||
                pole[0][2] == zero && pole[1][2] == zero && pole[2][2] == zero ||
                pole[0][0] == zero && pole[1][1] == zero && pole[2][2] == zero ||
                pole[0][2] == zero && pole[1][1] == zero && pole[2][0] == zero){
            System.out.println("Нажаль, премога за комп'ютером");
            System.exit(0);
        }

        int moveCounter = 0;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] != '_'){
                    moveCounter++;
                }
            }
        }

        System.out.println();
        if (moveCounter == 8){
            System.out.println("Нічия !!!");
            System.exit(0);
        }

















    }




}
