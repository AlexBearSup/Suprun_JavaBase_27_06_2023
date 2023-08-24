package ua.hillel.suprun.homeworks.homework18;

public class AverageOfArray {

    int[] array;

    public AverageOfArray(int[] array) {
        this.array = array;
    }

    private int average;

    public int getAverage() {
        return average;
    }

    public int averageNumber (){
        if (array != null){
            int x = 0;
            for (int i = 0; i < array.length; i++) {
                x += array[i];
            }
            average = x / array.length;
            System.out.println("Середньє значення массиву = " + average);
        }
        return average;
    }




}
