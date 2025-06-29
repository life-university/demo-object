package com.example.demo_object.object.ex2;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        Animal[] animals = {dog, cat, horse};
        for (int i = 0; i < animals.length; i++) {
            move(animals[i]);
        }
    }

    public static void move(Animal animal) {
        animal.move();
    }
}
