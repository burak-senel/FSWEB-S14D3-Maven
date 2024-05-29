package org.example.arge;

public class ElectricCar  extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        runEngine(this);

        System.out.println(getClass().getSimpleName() + " - The electric engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " - The electric car is driving");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
