package ua.hillel.suprun.lessons.lesson11;

public class AirFactory {

    String type;
    String name;
    int pas1;
    int pas2;

    AirFactory (String type, String name){
        this.type = type;
        this.name = name;
        System.out.println("винщувачі: " + this.type + " - " + this.name);
    }
    AirFactory (String type, String name, int Pas1){
        this.type = type;
        this.name = name;
        this.pas1 = pas1;
        System.out.println("винщувачі: " + this.type + " - " + this.name + this.pas1);

    }
    AirFactory (String type, String name, int pas1, int pas2){
        this.type = type;
        this.name = name;
        this.pas1 = pas1;
        this.pas2 = pas2;
        System.out.println("винщувачі: " + this.type + " - " + this.name + this.pas1 + this.pas2 );

    }


}
