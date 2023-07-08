package ua.hillel.suprun.homeworks.homework4;

public class Parallelepiped {
    public static void main(String[] args) {

        int sideA = 18;
        int sideB = 8;
        int sideC = 7;
        int volume = sideA * sideB * sideC;
        int length = (sideA * 4) + (sideB * 4) + (sideC * 4);
        String odVymir = "од.";
        char kub = 179;

        System.out.println();
        System.out.println("Об'єм паралелепіпеда = " + volume + " " + odVymir + kub);
        System.out.println();
        System.out.println("Довжина усіх сторін паралелепіпеду = " + length + " " + odVymir);



    }


}
