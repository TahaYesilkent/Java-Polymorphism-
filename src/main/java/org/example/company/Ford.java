package org.example.company;



public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {

        System.out.println(getClass().getSimpleName());
        return "Ford's powerful engine is igniting.";
    }

    @Override
    public String accelerate() {

        System.out.println(getClass().getSimpleName());
        return "Ford is gaining speed quickly.";
    }

    @Override
    public String brake() {

        System.out.println(getClass().getSimpleName());
        return "Ford's brakes are engaging with grip.";
    }
}