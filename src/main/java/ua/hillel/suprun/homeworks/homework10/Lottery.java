package ua.hillel.suprun.homeworks.homework10;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) {

        int length = 7;
        int[] arrayLot = new int[length];
        for (int i = 0; i < arrayLot.length; i++) {
            arrayLot[i] = (int) (Math.random()*10);
        }
        System.out.println();
        System.out.println("Числа, які загадані фірмою-організатором лотереї:");
        System.out.println(Arrays.toString(arrayLot));

        int[] arrayPla = {2, 9, 5, 1, 3, 4, 8};
        System.out.println("Числа, які обрав гравець:");
        System.out.println(Arrays.toString(arrayPla));

        //Cocktail Sort
        boolean swap = true;
        int start = 0;
        int end = arrayLot.length;

        while (swap){
            swap = false;

            for (int i = start; i < end - 1; i++) {
                if(arrayLot[i] > arrayLot[i + 1]){
                    int tempLot = arrayLot[i];
                    arrayLot[i] = arrayLot [i + 1];
                    arrayLot[i + 1] = tempLot;
                    swap = true;
                }
            }
            if (swap == false){
                break;
            }
            end--;

            for (int i = end - 1; i >= start; i--) {
                if(arrayLot[i] > arrayLot[i + 1]){
                    int tempLot1 = arrayLot[i];
                    arrayLot[i] = arrayLot [i + 1];
                    arrayLot[i + 1] = tempLot1;
                    swap = true;
                }
            }
            start++;
        }

        //Gnome Sort
        int index = 0;
        while (index < arrayPla.length) {
            if (index == 0)
                index++;
            if (arrayPla[index] >= arrayPla[index - 1])
                index++;
            else {
                int tempPla = arrayPla[index];
                arrayPla[index] = arrayPla[index - 1];
                arrayPla[index - 1] = tempPla;
                index--;
            }
        }


        System.out.println();
        System.out.println("Відсортовані числа:");
        System.out.println(Arrays.toString(arrayLot));
        System.out.println(Arrays.toString(arrayPla));

        int coincidence = 0;
        for (int i = 0; i < arrayPla.length; i++) {
            if (arrayLot[i] == arrayPla[i]){
                coincidence++;
            }
        }
        int indAGN = 0;
        int[] arrayGuessNumber = new int[coincidence];
        int[] arrayGuessNumberIndex = new int[coincidence];
        int[] arrayGuessNumberPor = new int[coincidence];
        int indInd = 0;
        int indPor = 0;
        for (int i = 0; i < arrayPla.length; i++) {
            if (arrayLot[i] == arrayPla[i]){
                  arrayGuessNumber[indAGN] = arrayLot[i];
                indAGN++;
                arrayGuessNumberIndex[indInd] = i;
                indInd++;
                arrayGuessNumberPor[indPor] = i + 1;
                indPor++;
            }
        }
        System.out.println();
        System.out.println("кількість співпадінь = " + coincidence);
        System.out.print("числа які співпали:");
        System.out.println(Arrays.toString(arrayGuessNumber));
        System.out.print("Їх порядок:");
        System.out.println(Arrays.toString(arrayGuessNumberPor));
        System.out.print("Їхні індекси:");
        System.out.println(Arrays.toString(arrayGuessNumberIndex));


    }





}


