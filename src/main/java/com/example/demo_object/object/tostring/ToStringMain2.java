package com.example.demo_object.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Red");
        Dog dog1 = new Dog("Buddy", 5);
        Dog dog2 = new Dog("Bru", 3);

        System.out.println("toString() method output:");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
