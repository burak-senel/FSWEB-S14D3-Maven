package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - Mitsubishi is braking";
    }
}
