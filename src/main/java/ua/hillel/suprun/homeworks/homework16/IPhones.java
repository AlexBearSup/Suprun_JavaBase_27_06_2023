package ua.hillel.suprun.homeworks.homework16;

public class IPhones implements Smartphones, IOS{

    private final String modelName = "iPhone";
    private int numberModel;

    public IPhones(int numberModel) {
        this.numberModel = numberModel;
    }

    public int getNumberModel() {
        return numberModel;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public void iOS() {
        System.out.println("operating system this phone is:");
        System.out.println("iOS 16.6");
        System.out.println("iOS is up to date");
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
}
