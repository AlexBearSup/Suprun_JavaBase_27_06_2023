package ua.hillel.suprun.homeworks.homework5;

public class ChineseDynasties {
    public static void main(String[] args) {

        int forceWarriorLi = 13;
        int forceArcherLi = 24;
        int forceRiderLi = 46;
        int numberOfSoldiersLi = 860;

        int forceWarriorMin = 9;
        int forceArcherMin = 35;
        int forceRiderMin = 12;
        int numberOfSoldiersMin = (int) (numberOfSoldiersLi * 1.5);

        int strengthOfTheWholeArmyLi = (forceWarriorLi + forceArcherLi + forceRiderLi) * numberOfSoldiersLi;
        int strengthOfTheWholeArmyMin = (forceWarriorMin + forceArcherMin + forceRiderMin) * numberOfSoldiersMin;

        String strengArmy = "Сила армії ";
        String Li = "династії Лі = ";
        String Min = "династії Мінь = ";

        System.out.println();
        System.out.println(strengArmy + Li + strengthOfTheWholeArmyLi);
        System.out.println();
        System.out.println(strengArmy + Min + strengthOfTheWholeArmyMin);


    }
}
