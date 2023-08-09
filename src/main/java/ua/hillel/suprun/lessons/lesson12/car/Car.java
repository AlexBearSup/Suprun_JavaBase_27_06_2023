package ua.hillel.suprun.lessons.lesson12.car;

public class Car {

    private String modelname;
    double fuelStatus;
    protected boolean isStart;
    public int countWheels;

    public Car(String modelname) {
        this.modelname = modelname;
    }

    public void start (){
        startElectronicSystem();
        startFuelSystem();
        startGPS();

    }
    private void startElectronicSystem (){
        System.out.println("startElectronicSystem");
    }
    private void startFuelSystem (){
        System.out.println("startFuelSystem");
    }
    private void startGPS (){
        System.out.println("startGPSSystem");
    }


    public String getModelname() {
        return modelname;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public boolean isStart() {
        return isStart;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public void setFuelStatus(double fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
}
