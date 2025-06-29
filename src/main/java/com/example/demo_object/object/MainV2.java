package com.example.demo_object.object;

public class MainV2 {

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.subMethod();
        sub.superMethod();

        String str = sub.toString();
        System.out.println("str = " + str);
    }
}
