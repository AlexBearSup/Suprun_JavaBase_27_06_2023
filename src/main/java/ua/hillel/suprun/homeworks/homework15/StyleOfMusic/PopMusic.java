package ua.hillel.suprun.homeworks.homework15.StyleOfMusic;

import ua.hillel.suprun.homeworks.homework15.Groups.MusicalGroup;

public class PopMusic extends MusicStyles {
    @Override
    public void playMusic(MusicalGroup musicalGroup) {
        System.out.println(musicalGroup.getName() + " played pop music");

    }
}
