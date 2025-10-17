package org.example.company;



public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        // getClass().getSimpleName() loglanıyor
        System.out.println(getClass().getSimpleName());
        return "Holden's engine is roaring to life.";
    }

    @Override
    public String accelerate() {

        System.out.println(getClass().getSimpleName());
        return "Holden is accelerating like a sportscar.";
    }

    @Override
    public String brake() {

        System.out.println(getClass().getSimpleName());
        return "Holden is performing emergency brake.";
    }
}