package com.example.demo_object.string;

public class StringMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("new String() == : " + (str1 == str2)); // false, different memory addresses
        System.out.println("new String() equals() : " + str1.equals(str2)); // true, same content

        System.out.println("string literal == : " + (str3 == str4)); // true, same memory address due to string interning
        System.out.println("string literal equals() : " + str3.equals(str4)); // true, same content
    }

}
