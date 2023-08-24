package ua.hillel.suprun.homeworks.homework18;

import java.sql.SQLOutput;

public class DoubleArray {


    static int[][] arrayD;

    public DoubleArray(int[][] arrayD) {
        this.arrayD = arrayD;
    }
    public static boolean squareArray (){
        int numberOfRows = arrayD.length;
        if (numberOfRows == 0){
            return false;
            }
        int numberOfcolumns = arrayD[0].length;
        for (int i = 0; i < arrayD.length; i++) {
            if (arrayD[i].length != numberOfcolumns){
                return false;
            }
        }
        return true;

    }

    public void examination (){
        if (squareArray() == true){
            System.out.println("Масив квадратний");
        } else {
            System.out.println("Масив не квадратний");
        }
    }

//    int[][] b2 = {{1,2,3},{1,2,3},{1,2,3}};
////        System.out.print(b2.length);
////        System.out.println();
////        System.out.print(b2[0].length);
//        if(b2.length == b2[0].length){
//        System.out.println("Kvadrat");
//    } else {
//        System.out.println("NE Kvadrat");
//    }  - більш легкий спосіб, але він не показує правду якщо масив зубчатий



}
