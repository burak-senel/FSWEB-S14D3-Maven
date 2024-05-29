package org.example.company;

public class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - Holden is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - Holden is braking";
    }
}
