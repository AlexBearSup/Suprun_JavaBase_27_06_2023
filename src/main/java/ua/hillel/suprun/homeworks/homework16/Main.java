package ua.hillel.suprun.homeworks.homework16;

public class Main {
    public static void main(String[] args) {

        IPhones myNewTelephone = new IPhones(14);
        Androids oldTelephone = new Androids("Xiaomi", "Redmi note 12 Pro");

        System.out.println("I bought myself " +  myNewTelephone.getModelName() + " " + myNewTelephone.getNumberModel());
        myNewTelephone.iOS();
        myNewTelephone.call();
        myNewTelephone.internet();
        myNewTelephone.sms();
        System.out.println();


        System.out.println("My old phone was" + oldTelephone.getNameOfCompany() + " " + oldTelephone.getModelName());
        oldTelephone.linuxOS();
        oldTelephone.call();
        oldTelephone.internet();
        oldTelephone.sms();
        System.out.println();





    }


}
