package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car mitsubishi = new Mitsubishi("deneme1", 2);
        Car holden = new Holden("deneme2", 3);
        Car ford = new Ford("deneme3", 4);

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        CarSkeleton gasCar = new GasPoweredCar(15.0, 4);
        CarSkeleton electricCar = new ElectricCar(200.0, 85);
        CarSkeleton hybridCar = new HybridCar(20.0, 40, 4);

        gasCar.startEngine();
        gasCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();

        printCarType(mitsubishi);
        printCarType(holden);
        printCarType(ford);
        printCarType(gasCar);
        printCarType(electricCar);
        printCarType(hybridCar);
    }
    public static void printCarType(Object car) {
        System.out.println("Car type: " + car.getClass().getSimpleName());
    }
}