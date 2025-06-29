package com.example.demo_object.object.tostring;

public class ToStringMain3 {

    public static void main(String[] args) {
        Car car = new Car("Red");
        Dog dog1 = new Dog("Buddy", 5);
        Dog dog2 = new Dog("Bru", 3);

        System.out.println("ObjectPrinter output:");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
