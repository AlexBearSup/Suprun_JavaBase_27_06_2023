package ua.hillel.suprun.homeworks.homework18;

public class ArrayUtil {

//    null = -3
//    empty = -2
    // "считает среднее число" = 1



    public static double averageNumber (int[] array){
        if (array == null){
            return -3;
        }
        if (array.length == 0 ){
            return -2;
        }
        int x = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
        }
        average = (double) x / array.length;
//        System.out.println("Середньє значення массиву = " + average);
        return average;
    }



    //    null = -3
    //    empty = -2
    //    "зубчатый" = -1
    //    kvadrat = 1

    public static int squareArray (int[][] arrayD){
        if (arrayD == null){
            return -3;
        }
        int numberOfRows = arrayD.length;
        if (numberOfRows == 0){
            return -2;
        }
        int numberOfcolumns = arrayD[0].length;
        for (int i = 0; i < arrayD.length; i++) {
            if (arrayD[i].length != numberOfcolumns){
                return -1;
            }
        }
        return 1;
    }

}
