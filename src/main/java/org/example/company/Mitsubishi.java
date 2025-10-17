package org.example.company;



public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {

        System.out.println(getClass().getSimpleName());
        return "Mitsubishi's engine is starting slowly.";
    }

    @Override
    public String accelerate() {

        System.out.println(getClass().getSimpleName());
        return "Mitsubishi is accelerating with power.";
    }

    @Override
    public String brake() {

        System.out.println(getClass().getSimpleName());
        return "Mitsubishi is braking smoothly.";
    }
}