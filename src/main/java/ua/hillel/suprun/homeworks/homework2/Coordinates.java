package ua.hillel.suprun.homeworks.homework2;

public class Coordinates {
    public static void main(String[] args) {

        String opis1 = "Широта: ";
        String opis2 = "  Довгота: ";
        String opisPidShir = " півн.шир.";
        String opisPidDovg = " схід.довг. ";




        String proBashnu = "Координати Ейфелевої вежі - ";
        float shirota = 48.85881F;
        float dovgota = 2.29481F;
        String zagalOpysProBashnu = proBashnu + opis1 + shirota + opisPidShir + opis2 + dovgota + opisPidDovg;

        System.out.println(zagalOpysProBashnu);



        String proPiramidu = "Координати Піраміди Хеопса - ";
        byte znachShiroty = 29;
        byte znachMinutShiroty = 58;
        byte znachSekundShiroty = 45;
        byte znachDovgoty = 31;
        String znachMinutDovgoty = "08";
        String znachSekundDovgoty = "03";
        char znakGradusa = '\u00B0';
        char znakMinut = '\'';
        char znakSekund = '\"';
        String zagalOpysProPiramidu = proPiramidu + opis1 + znachShiroty + znakGradusa + znachMinutShiroty + znakMinut + znachSekundShiroty + znakSekund + opisPidShir +
                opis2 + znachDovgoty + znakGradusa + znachMinutDovgoty + znakMinut + znachSekundDovgoty + znakSekund + opisPidDovg;

        System.out.println(zagalOpysProPiramidu);

    }
}
