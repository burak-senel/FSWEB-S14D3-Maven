package org.example.arge;

public class CarSkeleton {
    private String name,description;

    public CarSkeleton() {

    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " - The car's engine is starting");
    }

    public void drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " - The car is driving");
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " - The car's engine is running");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
