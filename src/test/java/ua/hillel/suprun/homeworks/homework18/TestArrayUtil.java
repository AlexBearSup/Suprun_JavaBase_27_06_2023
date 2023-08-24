package ua.hillel.suprun.homeworks.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestArrayUtil {
    static int[] arr1;
    static int[][] arr2;
//
//    @BeforeAll
//    static void bfall(){
//        arr1 = new int[] {1,2,3,4,5,6,7};
//        arr2 = new int[][] {{1,2,3},{1,2,3},{1,2,3}};
//    }

    //  тестирование 1го метода, считает ли среднее значение

    @Test
    void test11(){
        Assertions.assertEquals(-3, ArrayUtil.averageNumber(null));
    }
    @Test
    void test12(){
        arr1 = new int[] {};
        Assertions.assertEquals(-2, ArrayUtil.averageNumber(arr1));
    }
    @Test
    void test13() {
        arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assertions.assertEquals(1, ArrayUtil.averageNumber(arr1));
    }

    //  тестирование 2го метода, КВАДРТАНЫЙ ЛИ 2мерный массив

    @Test
    void test21(){
        Assertions.assertEquals(-3, ArrayUtil.squareArray(null));
    }
    @Test
    void test22(){
        arr2 = new int[][] {};
        Assertions.assertEquals(-2, ArrayUtil.squareArray(arr2));
    }
    @Test
    void test23(){
        arr2 = new int[][] {{1,2,3},{1,2},{1,2,3,4}};
        Assertions.assertEquals(-1, ArrayUtil.squareArray(arr2));
    }
    @Test
    void test24(){
        arr2 = new int[][] {{1,2,3},{1,2,3},{1,2,3}};
        Assertions.assertEquals(1, ArrayUtil.squareArray(arr2));
    }










}
