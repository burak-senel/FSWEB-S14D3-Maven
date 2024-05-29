package org.example.company;

public class Holden extends Car{
    public Holden( int cylinders,String name) {
        super(cylinders,name);
    }
    @Override
    public String startEngine() {
        return getName() + " - Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        return getName() + " - Holden is accelerating";
    }

    @Override
    public String brake() {
        return getName() + " - Holden is braking";
    }
}
