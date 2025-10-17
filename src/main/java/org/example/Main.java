package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("--- Pacific Car Company - Input Testi ---");
        System.out.println("=============================================");

        // *******************************************************
        // Kullanıcının özel olarak istediği INPUT bloğunun çalıştırılması
        // *******************************************************
        Car car = new Car(8, "Base car");
        System.out.println("Car -> " + car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("---------------------------------------------");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println("Car -> " + mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("---------------------------------------------");

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println("Car -> " + ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("---------------------------------------------");

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println("Car -> " + holden.getName());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("=============================================");
        System.out.println("--- Car R&D Company - Polymorphism Testi ---");
        System.out.println("=============================================");

        // *******************************************************
        // Car R&D Company projesi için istenen Polymorphism testleri
        // *******************************************************

        // Polymorphism: CarSkeleton tipinde alt sınıf instance'ları oluşturma
        CarSkeleton gasCar = new GasPoweredCar("Fosil", "Yüksek performanslı benzinli", 12.5, 6);
        CarSkeleton electricCar = new ElectricCar("Şimşek", "Sıfır emisyonlu elektrikli", 450.0, 75);
        CarSkeleton hybridCar = new HybridCar("Denge", "Yakıt ve elektrik verimliliği", 20.0, 40, 4);

        System.out.println("\n--- GasPoweredCar Test (Sınıf Tipi Loglanmalı) ---");
        System.out.println("Adı: " + gasCar.getName() + ", Açıklama: " + gasCar.getDescription());
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        System.out.println("\n--- ElectricCar Test (Sınıf Tipi Loglanmalı) ---");
        System.out.println("Adı: " + electricCar.getName() + ", Açıklama: " + electricCar.getDescription());
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        System.out.println("\n--- HybridCar Test (Sınıf Tipi Loglanmalı) ---");
        System.out.println("Adı: " + hybridCar.getName() + ", Açıklama: " + hybridCar.getDescription());
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());

        System.out.println("\n--- CarSkeleton (Parent) Test (runEngine çağrılmalı) ---");
        CarSkeleton genericCar = new CarSkeleton();
        System.out.println("Adı: " + genericCar.getName() + ", Açıklama: " + genericCar.getDescription());
        System.out.println(genericCar.startEngine());
        System.out.println(genericCar.drive()); // drive metodu içerisinden runEngine çağrılıyor
    }
}