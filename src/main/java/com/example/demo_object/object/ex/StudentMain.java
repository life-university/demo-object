package com.example.demo_object.object.ex;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Alice", 20);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
