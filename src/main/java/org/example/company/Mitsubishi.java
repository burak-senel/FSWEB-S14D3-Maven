package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi( int cylinders,String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return getName() + " - Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        return getName() + " - Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return getName() + " - Mitsubishi is braking";
    }
}
