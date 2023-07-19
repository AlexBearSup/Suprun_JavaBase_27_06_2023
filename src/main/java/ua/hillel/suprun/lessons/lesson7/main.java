package ua.hillel.suprun.lessons.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

//        int[] array = new int[5];
//
//        System.out.println(array.length);
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//

//        int[] array = {1, 2, 3, 4, 5};
//
////        int[] array = new int[10];
//        int[] array = new int[20];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 5 || array[i] == 10 || array[i] == 15) {
//                array[i] = 77;
//                System.out.println(array[i] = i);
//            }

//        for (int value : array) {
//            System.out.println(value);
//        }

//        int[] array = new int[0];

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                System.out.println(array[i]);
//            } else {
//                System.out.print(array[i] + ",");
//            }
//        }

//        int[] killer = new int[10];
//        int max = killer[0];
//        for (int i = 0; i < killer.length; i++) {
//            killer[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(killer));
//
//        for (int i = 0; i < killer.length; i++) {
//            if (killer[i] > max) {
//                max = killer[i];
//
//            }
//        }
//        for (int i = 0; i < killer.length; i++) {
//            if (killer[i] == max) {
//                System.out.println("max chance " + max + " index " + i);
//            }
//        }

        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        array2[0] = 99;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));



    }
}












