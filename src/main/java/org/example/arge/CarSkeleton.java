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
        runEngine(this);
        System.out.println(getClass().getSimpleName() + " - The car is driving");
    }

    protected void runEngine(CarSkeleton carSkeleton) {
if(carSkeleton instanceof ElectricCar){
double avgKmPerCharge=((ElectricCar)carSkeleton).getAvgKmPerCharge();
    int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
    System.out.println("Per Charge: "+avgKmPerCharge +" Battery: "+batterySize);

}else if(carSkeleton instanceof HybridCar){
    HybridCar hybridCar=(HybridCar) carSkeleton;
    System.out.println("Per Charge: "+ hybridCar.getAvgKmPerLiter()+"gibi..");
} else if (carSkeleton instanceof GasPoweredCar) {
    GasPoweredCar gasPoweredCar=(GasPoweredCar) carSkeleton;
    System.out.println("Çalışmayı gösterme denemesi silindir sayısı: "+gasPoweredCar.getCylinders());

}else
        System.out.println("Invalid car type");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
