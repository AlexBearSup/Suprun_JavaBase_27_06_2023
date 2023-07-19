package ua.hillel.suprun.homeworks.practics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practic2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = -1;
        int b = -1;
        while (true) {
            System.out.println("vvedite chislo a");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
            } else {
                System.out.println("vi vveli ne chislo, povtorite");
                scanner.nextLine();
                continue;
            }
            System.out.println("vvedite chislo b");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            } else {
                System.out.println("vi vveli ne chislo , povtorite");
                scanner.nextLine();
                continue;
            }


            int summa = a + b;
            int umn = a * b;
            int minus = a - b;
            int del = a / b;
            System.out.println("summa =" + summa);
            System.out.println("umn =" + umn);
            System.out.println("minus =" + minus);
            System.out.println("del =" + del);
            break;
        }






        }
}
