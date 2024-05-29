package org.example.company;

public class Ford extends Car{
    public Ford( int cylinders,String name) {
        super(cylinders,name);
    }
    @Override
    public String startEngine() {
        return getName() + " - Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        return getName() + " - Ford is accelerating";
    }

    @Override
    public String brake() {
        return getName()+ " - Ford is braking";
    }
}
