package org.example.arge;

public class HybridCar  extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLiter, int batterySize, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " - The hybrid engine is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " - The hybrid car is driving");
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
