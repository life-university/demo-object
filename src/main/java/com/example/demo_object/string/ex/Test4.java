package com.example.demo_object.string.ex;

public class Test4 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange,grape";
        //
        String[] fruitArray = fruits.split(",");
        for (String fruit : fruitArray) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println(String.join("->", fruitArray));
    }
}
