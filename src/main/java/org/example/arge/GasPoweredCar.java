package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public String startEngine() {
        System.out.println("The type of car is: " + getClass().getSimpleName());
        return getName() + " (Gas) engine starting. It has " + cylinders + " cylinders.";
    }


    @Override
    public String drive() {

        return getName() + " (Gas) is driving. Consumes " + avgKmPerLitre + " km/L.";
    }
}