package ua.hillel.suprun.homeworks.homework9;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {


        int[] ageT1 = new int[25];
        int[] ageT2 = new int[25];
        int sumAgeTeam1 = 0;
        int sumAgeTeam2 = 0;

        for (int i = 0; i < ageT1.length; i++) {
            ageT1[i] = (int) (18 + (Math.random() * 22));
        }
        System.out.println();
        System.out.println("List of age team \"Eagles\":");
        System.out.println(Arrays.toString(ageT1));
        for (int i = 0; i < ageT1.length; i++) {
            sumAgeTeam1 += ageT1[i];
        }
        double averageAgeT1 = (double) sumAgeTeam1 / ageT1.length;
        System.out.println("Average age of players team \"Eagles\" = " + (Math.round(averageAgeT1)) + " years");
        System.out.println();

        for (int i = 0; i < ageT2.length; i++) {
            ageT2[i] = (int) (18 + (Math.random() * 22));
        }
        System.out.println("List of age team \"Bears\":");
        System.out.println(Arrays.toString(ageT2));
        for (int i = 0; i < ageT2.length; i++) {
            sumAgeTeam2 += ageT2[i];
        }
        double averageAgeT2 = (double) sumAgeTeam2 / ageT2.length;
        System.out.println("Average age of players team \"Bears\" = " + (Math.round(averageAgeT2)) + " years");






    }




}
