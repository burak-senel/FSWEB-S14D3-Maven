package org.example.company;

public class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - Ford is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - Ford is braking";
    }
}
