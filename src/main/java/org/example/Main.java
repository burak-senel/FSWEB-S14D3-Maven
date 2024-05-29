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
        Car mitsubishi = new Mitsubishi( 2,"deneme1");
        Car holden = new Holden( 3,"deneme2");
        Car ford = new Ford( 4,"deneme3");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        CarSkeleton gasCar = new GasPoweredCar("denemeler", "wfdsf",5,3);
        CarSkeleton electricCar = new ElectricCar("denemelerce", "wsdgsdf",4,5);
        CarSkeleton hybridCar = new HybridCar("denemelercee3", "dsfsdf",4,4,5);

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
        System.out.println(mitsubishi);
        System.out.println(gasCar);
    }
    public static void printCarType(Object car) {
        System.out.println("Car type: " + car.getClass().getSimpleName());
    }
}