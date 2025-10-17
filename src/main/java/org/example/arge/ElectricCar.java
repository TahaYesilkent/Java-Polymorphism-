package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }


    @Override
    public String startEngine() {
        System.out.println("The type of car is: " + getClass().getSimpleName());
        return getName() + " (Electric) engine starting silently. Battery size: " + batterySize + " kWh.";
    }


    @Override
    public String drive() {
        return getName() + " (Electric) is driving. Range: " + avgKmPerCharge + " km/charge.";
    }
}