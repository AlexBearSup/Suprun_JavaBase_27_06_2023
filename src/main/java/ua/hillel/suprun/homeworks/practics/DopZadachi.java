package ua.hillel.suprun.homeworks.practics;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class DopZadachi {
    public static void main(String[] args) {

//        System.out.println("task # 1");
//        System.out.println("Дан масив [1, 2, 3]. Зробіть із нього масив [3, 2, 1].");
//
//        System.out.println("in direct order");
//        int[] array = {1, 2, 3};
//        int[] reversArray = new int[array.length];
//        System.out.println(Arrays.toString(array));
//        System.out.println(3 - 2 - 1);
//        System.out.println("in reverse order");
//        for (int i = array.length - 1; i >= 0; i--) {
//            reversArray[array.length - i - 1] = array[i];
//        }
//        System.out.println(Arrays.toString(reversArray));
//        System.out.println();




//        System.out.println("task # 2"); // +- должно быть проще, я шел от обратного от задачи 3
//        System.out.println("Дан масив [1, 2, 3]. Додайте йому до кінця елементи 4, 5, 6.");
//
//        int[] arr2 = {1, 2, 3};
//        int[] arr22 = {4, 5, 6};
//        int[] newArray = new int[arr2.length + arr22.length];
//        int index = 3;
//
//        for (int newAind : arr22) {
//            newArray[index] = newAind;
//            index ++;
//        }
//        index =0;
////        System.out.println(index);
//        for (int i = 0; i < arr2.length; i++) {
//            newArray[index] = arr2[i];
//            index++;
//        }
//        System.out.println("final array - " + (Arrays.toString(newArray)));
//
//
//
//        System.out.println("task # 3");
//        System.out.println("Дан масив [1, 2, 3]. Додайте йому на початок елементи 4, 5, 6.");
//
//        int[] arr3 = {1, 2, 3};
//        int[] arr4 = {4, 5, 6};
//        int[] newArray = new int[arr3.length + arr4.length];
//        int index = 0;
//
//        for (int newAind : arr4) {
//            newArray[index] = newAind;
//            index ++;
//        }
////        System.out.println(index);
//        for (int i = 0; i < arr3.length; i++) {
//            newArray[index] = arr3[i];
//            index++;
//        }
//        System.out.println("final array - " + (Arrays.toString(newArray)));
//


//
//        System.out.println("task # 4");
//        System.out.println("Дан масив [1, 2, 3, 4, 5]. Перетворіть масив на [1, 2, 10, 3, 4, 5].");
//        int[] arr4 = {1, 2, 3, 4, 5};
//        int addNum = 10;
//        int newInd = 2;
//        int[] addArray = new int[arr4.length + 1];
//
//        for (int i = 0; i < addArray.length; i++) {
//            if (i < newInd) {
//                addArray[i] = arr4[i];
//            } else if (i == newInd){
//                addArray[i] = addNum;
//            } else {
//                addArray[i] = arr4[i - 1];
//            }
//        }
//        System.out.println("final array - " + (Arrays.toString(addArray)));
//
//
//
//
////
//        System.out.println("task # 5");
//        System.out.println("Дан масив [3, 4, 1, 2, 7]. Відсортуйте його.");
//        int[] sortArray = {3, 4, 1, 2, 7};
////        Arrays.sort(sortArray);
////        System.out.println("final array - " + (Arrays.toString(sortArray))); // решение методом sort
//        for (int i = 0; i < sortArray.length - 1; i++) {
//            for (int k = 0; k < sortArray.length - i - 1; k++) {
//                if (sortArray[k] > sortArray[k + 1]){
//                    int change = sortArray[k];
//                    sortArray[k] = sortArray[k + 1];
//                    sortArray[k + 1] = change;
//                }
//            }
//        }
//        System.out.println("final array - " + (Arrays.toString(sortArray))); // сопособ "пузырёк", можно и в обратную чторону , меняем знак <>
////
//
//
//
//
//        System.out.println("task # 6");
//        System.out.println("Дан масив з елементами 'Привіт, ', 'світ' і '!'. Необхідно вивести на екран фразу 'Привіт, світ!'.");
//        System.out.println();
////        String[] sArr = new String[3]; // через обьяв, кажд индекс
//        String[] sArr2 = new String[] {"Привіт, ", "світ", " ! " };
////        sArr2[0] = "Привіт,";// через обьяв, кажд индекс
////        sArr2[1] = " світ";// через обьяв, кажд индекс
////        sArr2[2] = " ! ";// через обьяв, кажд индекс
//        String sArrV = sArr2[0] + sArr2[1] + sArr2[2];
//        System.out.println("display on screen1 - " + sArrV); // через обьявление каждого индекса
//
//
//
//        System.out.println("task # 7");
//        System.out.println("Створіть масив arr = ['a', 'b', 'c', 'd'] і за допомогою його виведіть на екран рядок 'a+b, c+d'.");
//        String[] arr = new String[] { "a", "b", "c", "d",};
//        System.out.println("display on screen - " + arr[0] + "+" + arr[1] + ", " + arr[2] + "+" + arr[3] );
//
//
//
//
//        System.out.println("task # 8");
//        System.out.println("Запитайте у користувача кількість елементів масиву. Виходячи з даних, які ввів користувач створіть масив на ту кількість ");
//        System.out.println("елементів, яку передав користувач. у кожному індексі масиву зберігайте число яке показуватиме номер елемента масиву.");
//        System.out.print("введіть кількість елементів масиву (ЧИСЛО) - ");
//        Scanner scanner = new Scanner(System.in);
//        int numberEntry;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                numberEntry = scanner.nextInt();
//                if (numberEntry <= 0) {
//                    System.out.print("від'ємне значення або \"0\", будь-ласка введіть знову - ");
//                    scanner.nextLine();
//                } else {
//                    break;
//                }
//                } else {
//                System.out.print("помилкове значення (не число) , будь-ласка введіть знову -");
//                scanner.nextLine();
//            }
//        }
//        System.out.println();
//        System.out.println("введене число = " + numberEntry + "." + " Тому масив складатиметься з " + numberEntry + " елементів.");
//
//        int[] array8 = new  int[numberEntry];
//
//        for (int i = 0; i < array8.length; i++) {
//            array8[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array8));




//        System.out.println("task # 9");
//        System.out.println("Напишите сценарий, который найдет в массиве все отрицательные значения и заменить их на значения 0.");
//        System.out.println("После этого выведет на экран все элементы массива.");
//        System.out.println();
//        int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};
//        System.out.println("Первоночальный массив:");
//        System.out.println(Arrays.toString(values));
//
//        for (int i = 0; i < values.length; i++) {
//            if (values[i] < 0){
//                values[i] = 0;
//            }
//        }
//        System.out.println("все отрицательные значения заменены на \"0\" массив:");
//        System.out.println(Arrays.toString(values));






//        System.out.println("task # 10");
//        System.out.println("Дано массив.Создайте на оснoве значений этого массива два новых массива.");
//        System.out.println("В один массив поместите все четные значения, а во второй все нечетные.");
//        System.out.println("Выведите на экран значения, которые вошли в первый массив и во второй массив.");
//        System.out.println();
//        int[] values = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23, 44, 53, 26, 23, 14, 13, 61, 44, 37};
//        System.out.println("Начальный массив:");
//        System.out.println(Arrays.toString(values));
//        System.out.println();
//        int counterEven = 0;
//        int counterOdd = 0;
//        for (int i = 0; i < values.length; i++) {
//            if (values[i] % 2 == 0) {
//                counterEven++;
//            } else {
//                counterOdd++;
//            }
//        }
////        System.out.println(counterEven);
////        System.out.println(counterOdd);
//        int[] evenArray = new int[counterEven];
//        int[] oddArray = new int[counterOdd];
//        int j = 0;
//        int k = 0;
//        for (int i = 0; i < values.length; i++) {
//            if (values[i] % 2 == 0) {
//                evenArray[j] = values[i];
//                j++;
//            } else {
//                oddArray[k] = values[i];
//                k++;
//            }
//        }
//        System.out.println("Массив с чётными:");
//        System.out.println(Arrays.toString(evenArray));
//        System.out.println();
//        System.out.println("Массив с нечётными:");
//        System.out.println(Arrays.toString(oddArray)); // мб есть вариант проще, провести всё в 1й проверке и сразу задать длину массивов (или вообще решение другое ?)




//        System.out.println("task # 11");
//        System.out.println("Найдите первый положительный элемент массива и выведите его на экран.");
//        System.out.println();
//        int[] values11 = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};
//        System.out.println("Начальный массив:");
//        System.out.println(Arrays.toString(values11));
//        System.out.println();
//        for (int i = 0; i < values11.length; i++) {
//            if (values11[i] > 0){
//                System.out.println("Первый положительный элемент массива = " + values11[i] + ", его индекс = " + i);
//                break;
//            }
//        }






//        System.out.println("task # 12");
//        System.out.println("Данно массив.Поменяйте элемент с максимальным значением местами с элементом с минимальным значением.");
//        int[] values12 = {10, 20, 4, 6, 11, 9, 125, 1, 8, 0, 3};
//        System.out.println("Начальный массив:");
//        System.out.println(Arrays.toString(values12));
//
//        int maxARind = 0;
//        for (int i = 0; i < values12.length; i++) {
//            if (values12[i] > values12[maxARind]){
//                maxARind = i;
//            }
//        }
////        System.out.println();
////        System.out.println("max индекс = " + maxARind);
////        System.out.println("max значение = " + values12[maxARind]);
//        int minARind = 0;
//        for (int i = 0; i < values12.length; i++) {
//            if (values12[i] < values12[minARind]){
//                minARind = i;
//            }
//        }
////        System.out.println();
////        System.out.println("min индекс = " + minARind);
////        System.out.println("min значение = " + values12[minARind]);
//
//        int zamena = values12[maxARind];
//        values12[maxARind] = values12[minARind];
//        values12[minARind] = zamena;
//
//        System.out.println();
//        System.out.println("массив с изменнёными значениями");
//        System.out.println(Arrays.toString(values12));





//        System.out.println("task # 13");
//        System.out.println("Дано массив.Найдите среднее арифметическое для значений этого массива.");
//        System.out.println("Выведите на экран только те элементы, которые больше этого среднего арифместического значения");
//        int[] values13 = {10, 20, 48, 6, 11, 9, 125, 1, 8, 0, 3, 255, 77, 11, 170, 4, 28};
//        System.out.println("Начальный массив:");
//        System.out.println(Arrays.toString(values13));
//
//
//        int sum = 0;
//        for (int i = 0; i < values13.length; i++) {
//            sum += values13[i];
//        }
////        System.out.println(sum);
//        sum = sum / values13.length;
//        System.out.println();
//        System.out.println("среднее арифметическое значение массива = " + sum);
//        System.out.println();
//        int counterj = 0;
//        for (int i = 0; i < values13.length; i++) {
//            if (values13[i] > sum) {
//                counterj++;
//            }
//        }
////        System.out.println(counterj);
//        int[] arrayBeggerSum = new int[counterj];
//        int k = 0;
//        for (int i = 0; i < values13.length; i++) {
//            if(values13[i] > sum ) {
//                arrayBeggerSum[k] = values13[i];
//                k++;
//            }
//        }
//        System.out.println("элементы которые больше ср.арифметического");
//        System.out.println(Arrays.toString(arrayBeggerSum));




















    }

}
