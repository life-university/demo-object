package com.example.demo_object.object.tostring;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
