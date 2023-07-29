package ua.hillel.suprun.homeworks.homework12;

public class Person {

    static String personInfo (String name, String surname, String city, String telNumber) {
        String info = "Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + telNumber;

        return info;
    }
    public static void main(String[] args) {
        System.out.println();
        String name1 = "Більбо";
        String surName1 = "Беггінс";
        String city1 = "Шир";
        String telNumber1 = "+13-11-111-11-11";
        System.out.println(personInfo(name1, surName1, city1, telNumber1));
        System.out.println();


        String person2 = personInfo("Брюс", "Уейн", "Готем", "+440-98-265-4730");
        System.out.println(person2);

        System.out.println();
        System.out.println(personInfo("Джайна", "Праудмур", "Лордерон", "+275-17-771-77-15"));


    }


}
