package ua.hillel.suprun.homeworks.practics;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class DopZadachi {
    public static void main(String[] args) {

//        System.out.println("task # 1");
//        System.out.println("System.out.println(Дан масив [1, 2, 3]. Зробіть із нього масив [3, 2, 1].");
//
//        System.out.println("in direct order");
//        int[] array = {1, 2, 3};
//        int[] reversArray = new int[array.length];
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("in reverse order");
//        for (int i = array.length - 1; i >= 0; i--) {
//            reversArray[array.length - i - 1] = array[i];// почему если мы просто выводим sout(array[i])и оно выводится в столбик, то значения не перезаписываются ?
//        }
//        System.out.println(Arrays.toString(reversArray)); // почему если мы просто выводим sout(array[i])и оно выводится в столбик, то значения не перезаписываются ?
//        System.out.println();




//        System.out.println("task # 2");
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
//        System.out.println("final array - " + (Arrays.toString(newArray))); // +- должно быть проще, я шел от обратного от задачи 3
//
//
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
//        System.out.println("final array - " + (Arrays.toString(newArray))); // +-
//
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
//        System.out.println("final array - " + (Arrays.toString(addArray))); // +- понятно
//
//
//
//
//
//        System.out.println("task # 5");
//        System.out.println("Дан масив [3, 4, 1, 2, 7]. Відсортуйте його.");
//
//        int[] sortArray = {3, 4, 1, 2, 7};
////        Arrays.sort(sortArray);
////        System.out.println("final array - " + (Arrays.toString(sortArray))); // решение методом
//        int j = 0;
//        for (int i = 0; i < sortArray.length - 1; i++) {
//            for (int k = 0; k < sortArray.length - i - 1; k++) {
//                if (sortArray[k] < sortArray[k + 1]){
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
//
//        String[] sArr = new String[3];
//        sArr[0] = "Привіт,";
//        sArr[1] = " світ";
//        sArr[2] = " ! ";
//        String sArrV = sArr[0] + sArr[1] + sArr[2];
//        System.out.println("display on screen1 - " + sArrV); // через обьявление каждого индекса
//        String[] strArr = new String[]{"Привіт, ","світ ","!"};
//        System.out.println("display on screen2 - " + Arrays.toString(strArr)); // выводится со скобочками, мб есть другой метод
//        System.out.println("display on screen3 - " + strArr[0] + strArr[1] + strArr[2]);
//
//
//
//
//
//        System.out.println("task # 7");
//        System.out.println("Створіть масив arr = ['a', 'b', 'c', 'd'] і за допомогою його виведіть на екран рядок 'a+b, c+d'.");
//        String[] arr = new String[] { "a", "b", "c", "d",};
//
//        System.out.println("display on screen - " + arr[0] + "+" + arr[1] + ", " + arr[2] + "+" + arr[3] ); // +- зрозуміло
//
//
//
//
//
//
//
        System.out.println("task # 8");
        System.out.println("Запитайте у користувача кількість елементів масиву. Виходячи з даних, які ввів користувач створіть масив на ту кількість " +
                "елементів, яку передав користувач. у кожному індексі масиву зберігайте число яке показуватиме номер елемента масиву.");
        System.out.print("введіть кількість елементів масиву (ЧИСЛО) - ");
        Scanner scanner = new Scanner(System.in);
        int numberEntry;
        while (true) {
            if (scanner.hasNextInt()) {
                numberEntry = scanner.nextInt();
                if (numberEntry <= 0) {
                    System.out.print("від'ємне значення або \"0\", будь-ласка введіть знову - ");
                    scanner.nextLine();
                } else {
                    break;
                }
                } else {
                System.out.print("помилкове значення (не число) , будь-ласка введіть знову -");
                scanner.nextLine();
            }
        }
        System.out.println();
        System.out.println("введене число = " + numberEntry + "." + " Тому масив складатиметься з " + numberEntry + " елементів.");

        int[] array8 = new  int[numberEntry];

        for (int i = 0; i < array8.length; i++) {
            array8[i] = i + 1;
        }
        System.out.println(Arrays.toString(array8)); // ну тут ніби не складно
























//            Задание:
//    Напишите сценарий, который найдет в массиве все отрицательные значения и заменить их на значения 0.
//    После этого выведет на экран все элементы массива.
//    int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};
//
//    Задание:
//    Дано массив.Создайте на оснoвое значений этого массива два новых массива.В один массив поместите все четные значения, а во второй все нечетные.
//    Выведите на экран значения, которые вошли в первый массив и во второй массив.
//
//    int[] values = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23};
//
//
//    Задание:
//    Найдите первый положительный элемент массива и выведите его на экран.
//
//    int[] values = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};
//
//
//    Задание:
//    Данно массив.Поменяйте элемент с максимальным значением местами с элементом с минимальным значением.
//
//    int[] values = {10, 20, 4, 6, 11, 9, 125, 1, 8, 0, 3};
//
//
//
//    Задание:
//    Дано массив.Найдите среднее арифметическое для значений этого массива.
//    Выведите на экран только те элементы, которые больше этого среднего арифместического значения
//
//    int[] values = {10, 20, 48, 6, 11, 9, 125, 1, 8, 0, 3, 255, 77, 11, 170, 4, 28};

    }

}
