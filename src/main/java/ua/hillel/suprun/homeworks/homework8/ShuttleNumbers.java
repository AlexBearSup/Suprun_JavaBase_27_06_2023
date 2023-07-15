package ua.hillel.suprun.homeworks.homework8;

import org.w3c.dom.css.Counter;

public class ShuttleNumbers {
    public static void main(String[] args) {

        int numbersOfShips = 100;
        int badNumber1 = 4;
        int badNumber2 = 9;
        System.out.println("we must get " + numbersOfShips + " numbers, in the numbers of which the numbers 4 and 9 are missing ");
        int allnumber = 0;

            for (int i = 0; true; i++) {
                if (i / 10 == badNumber1 || i % 10 == badNumber1 || i / 10 == badNumber2 || i % 10 == badNumber2 ||
                        i / 10 == badNumber1 + 10 ||  i / 10 == badNumber2 + 10 || // для 100 корабл
                        i / 10 == badNumber1 + 20 ||  i / 10 == badNumber2 + 20  ){  // для 200 корабл
                    continue;
                }
                System.out.print(i + ";");
                allnumber++;
                if (allnumber == numbersOfShips ){
                    break;
                }

            }


        System.out.println();
        System.out.println("total " + allnumber + " numbers");



















    }



}
