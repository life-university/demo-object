package com.example.demo_object.string;

public class StringMain4 {

    public static void main(String[] args) {
        String output = "";
        for (int i = 65; i < 91; i++) {
            char ch = (char) i;
            output += ch + " ";
        }
        System.out.println(output.trim());
    }
}
