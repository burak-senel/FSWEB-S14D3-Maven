package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLiter, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " - The gas engine is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " - The gas car is driving");
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
