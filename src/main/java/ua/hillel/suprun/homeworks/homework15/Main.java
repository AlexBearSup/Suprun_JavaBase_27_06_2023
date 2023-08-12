package ua.hillel.suprun.homeworks.homework15;

import ua.hillel.suprun.homeworks.homework15.Groups.ClassicalMusician;
import ua.hillel.suprun.homeworks.homework15.Groups.MusicalGroup;
import ua.hillel.suprun.homeworks.homework15.Groups.PopGroup;
import ua.hillel.suprun.homeworks.homework15.Groups.RockGroup;
import ua.hillel.suprun.homeworks.homework15.StyleOfMusic.ClassicMusic;
import ua.hillel.suprun.homeworks.homework15.StyleOfMusic.MusicStyles;
import ua.hillel.suprun.homeworks.homework15.StyleOfMusic.PopMusic;
import ua.hillel.suprun.homeworks.homework15.StyleOfMusic.RockMusic;

public class Main {

    public static void main(String[] args) {

        RockGroup evanescence = new RockGroup("Evanescence");
        RockGroup linkinPark = new RockGroup("Linkin Park");
        RockGroup rhcp = new RockGroup("Red Hot Chili Peppers");
        PopGroup backstreetBoys = new PopGroup("Backstreet Boys");
        PopGroup destinysChild = new PopGroup("Destiny’s Child");
        PopGroup stereolizza = new PopGroup("Stereolizza");
        ClassicalMusician beethoven = new ClassicalMusician("Ludwig van Beethoven");
        ClassicalMusician wagner = new ClassicalMusician("Wilhelm Richard Wagner");

        ClassicMusic classicMusic= new ClassicMusic();
        PopMusic popMusic= new PopMusic();
        RockMusic rockMusic = new RockMusic();

        ClassicalMusician[] classicMusicians = {beethoven, wagner};
        PopGroup[] popGroups = {backstreetBoys, destinysChild, stereolizza};
        RockGroup[] rockGroups = {rhcp, linkinPark, evanescence};

        for (ClassicalMusician classicMusician : classicMusicians) {
            classicMusic.playMusic(classicMusician);
        }
        System.out.println();
        for (PopGroup popGroup : popGroups) {
            popMusic.playMusic(popGroup);
        }
        System.out.println();
        for (RockGroup rockGroup : rockGroups) {
            rockMusic.playMusic(rockGroup);
        }


    }



}
