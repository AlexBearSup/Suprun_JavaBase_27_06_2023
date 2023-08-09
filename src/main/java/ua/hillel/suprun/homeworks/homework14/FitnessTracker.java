package ua.hillel.suprun.homeworks.homework14;

public class FitnessTracker {

    String surname;
    double weight;
    int pressureHigh;
    int pressureLow;
    int numberOfStepsTaken;

    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String eMail;
    private final String telNumber;
    private final int age;

    public FitnessTracker(String name, String surname, int birthDay, int birthMonth, int birthYear, String eMail,
                          String telNumber, double weight, int pressureHigh, int pressureLow, int numberOfStepsTaken) {
        this.surname = surname;
        this.weight = weight;
        this.pressureHigh = pressureHigh;
        this.pressureLow = pressureLow;
        this.numberOfStepsTaken = numberOfStepsTaken;
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.eMail = eMail;
        this.telNumber = telNumber;
        this.age = 2023 - birthYear;
    }

    void printAccountInfo(){
        System.out.println("-----------------------------");
        System.out.println("Ім'я/прізвище: " + name + " " + surname);
        System.out.println("Дата народження: " + birthDay + "." + birthMonth + "." + birthYear + "р.");
        System.out.println("Вік: " + age + " р.");
        System.out.println("Електронна пошта: " + eMail);
        System.out.println("Телефон: " + telNumber);
        System.out.println("Вага: " + weight + "кг");
        System.out.println("Тиск: " + pressureHigh + "/" + pressureLow);
        System.out.println("Кількість пройдених за день кроків: " + numberOfStepsTaken);
        System.out.println("-----------------------------");
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressureHigh(int pressureHigh) {
        this.pressureHigh = pressureHigh;
    }

    public void setPressureLow(int pressureLow) {
        this.pressureLow = pressureLow;
    }

    public void setNumberOfStepsTaken(int numberOfStepsTaken) {
        this.numberOfStepsTaken = numberOfStepsTaken;
    }
}
