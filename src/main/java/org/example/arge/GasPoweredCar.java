package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        runEngine(this);

        System.out.println(getClass().getSimpleName() + " - The gas engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " - The gas car is driving");
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
