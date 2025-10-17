package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public String startEngine() {
        System.out.println("The type of car is: " + getClass().getSimpleName());
        return getName() + " (Hybrid) engine starting. Combines " + cylinders + " cylinders and " + batterySize + " kWh battery.";
    }


    @Override
    public String drive() {
        return getName() + " (Hybrid) is driving. Efficiently using both gas (" + avgKmPerLitre + " km/L) and electric power.";
    }
}