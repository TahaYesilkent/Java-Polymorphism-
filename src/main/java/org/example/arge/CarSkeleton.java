package org.example.arge;



public class CarSkeleton {
    private String name;
    private String description;


    public CarSkeleton() {
        this.name = "Generic Car";
        this.description = "A basic car skeleton.";
    }


    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public String startEngine() {

        System.out.println("The type of car is: " + getClass().getSimpleName());
        return "CarSkeleton's engine is starting.";
    }


    protected String runEngine() {
        return "CarSkeleton's engine is running.";
    }


    public String drive() {
        System.out.println("CarSkeleton is calling runEngine()...");
        System.out.println(runEngine());
        return "CarSkeleton is driving.";
    }
}