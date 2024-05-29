package org.example.company;

public class Car {
    private boolean engine;
    private String name;
    private int cylinders,wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine() {
        return getClass().getSimpleName() + " - The car's engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " - The car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + " - The car is braking";
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
