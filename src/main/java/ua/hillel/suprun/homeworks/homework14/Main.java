package ua.hillel.suprun.homeworks.homework14;

public class Main {
    public static void main(String[] args) {

        FitnessTracker person1 = new FitnessTracker("Віталій", "Бубка", 1, 3,1978,
                "Bubka@gmail.com","+38-063-975-14-12", 112.2,120,80,
                4500);
        person1.printAccountInfo();
        System.out.println();

        FitnessTracker person2 = new FitnessTracker("Сергій", "Ребров", 11,11,1999,
                "rebro12@gmail.com","+38-068-912-24-22", 98,110,70,
                12000);
        person2.printAccountInfo();
        System.out.println();

        FitnessTracker person3 = new FitnessTracker("Катерина", "Дніпровська", 31, 10,2001,
                "flower2001@gmail.com","+38-099-111-24-23", 58,130,90,
                9000);
        person3.printAccountInfo();
        System.out.println();

        FitnessTracker person4 = new FitnessTracker("Олександр", "Петров", 31,12,1964,
                "Daddy196412@gmail.com","+38-068-912-24-22", 101,145,80,
                8000);
        person4.printAccountInfo();
        System.out.println();

        FitnessTracker person5 = new FitnessTracker("Олена", "Теліга", 29,2,1990,
                "lenochkaBog@gmail.com","+38-055-912-24-22", 68,90,70,
                6000);
        person5.printAccountInfo();
        System.out.println();


        person1.setNumberOfStepsTaken(6000);
        person2.setPressureHigh(132);
        person2.setPressureLow(92);
        person5.setSurname("Бубка");
        person5.setWeight(55);
        person5.setNumberOfStepsTaken(15000);

        person1.printAccountInfo();
        System.out.println();
        person2.printAccountInfo();
        System.out.println();
        person5.printAccountInfo();


    }




}
