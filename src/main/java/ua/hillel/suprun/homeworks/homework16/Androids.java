package ua.hillel.suprun.homeworks.homework16;

public class Androids implements Smartphones, LinuxOS{

    private String nameOfCompany;
    private String modelName;

    public Androids(String nameOfCompany, String modelName) {
        this.nameOfCompany = nameOfCompany;
        this.modelName = modelName;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getModelName() {
        return modelName;
    }
    @Override
    public void call() {
    }

    @Override
    public void sms() {
    }

    @Override
    public void internet() {
    }

    @Override
    public void linuxOS() {
        System.out.println("operating system this phone is:");
        System.out.println("Debian 12 GNOME");
        System.out.println("version: 6.4.3");
    }
}
