package ua.hillel.suprun.homeworks.practics;

import javax.swing.*;
import java.util.Scanner;

public class trololo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int god = 0;
//        System.out.println("vvedite god rojdeniya");
//        if (scanner.hasNextInt()){
//            god = scanner.nextInt();
//        } else {
//            System.out.println("wrong need rebut");
//            System.exit(0);
//        }
//
//        if (god % 400 == 0) {
//            System.out.println("you were born in " + god + "." + " This is leap year");
//        } else if (god % 100 == 0){
//            System.out.println("you were born in " + god + "." + " This is not leap year");
//        } else if (god % 4 == 0){
//            System.out.println("you were born in " + god + "." + " This is leap year");
//        } else {
//            System.out.println("you were born in " + god + "." + " This is not leap year");
//        }

        // ДЕНЬ НЕДЕЛИ
        int den = 1;
        System.out.println("введите число от 1 до 7, что бы выбрать день недели :");
        if (scanner.hasNextInt() && (scanner.nextInt() > 0)){
            den = scanner.nextInt();
            System.out.println("выбрано число = " + den);
        } else {
            System.out.println("chislo dolgno byt > 0");
        }

        switch (den) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;

            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такое вряд ли получится, но всё же :)");
                return;
        }












    }
}
