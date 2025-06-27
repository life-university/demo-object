package com.example.demo_object.identity_equality.v2;

import com.example.demo_object.identity_equality.v1.MemberV1;

public class IdentityEqualsMainV2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        long l1 = 1000L;
        long l2 = 1000L;

        String s1 = "abc";
        String s2 = "abc";

        MemberV1 member1 = new MemberV1(1L, "Member1");
        MemberV1 member2 = new MemberV1(1L, "Member1");

        if (a == b) {
            System.out.println("a and b are equal using '==' operator.");
        } else {
            System.out.println("a and b are not equal using '==' operator.");
        }

        if (l1 == l2) {
            System.out.println("l1 and l2 are equal using '==' operator.");
        } else {
            System.out.println("l1 and l2 are not equal using '==' operator.");
        }

        if (s1 == s2) {
            System.out.println("s1 and s2 are equal using '==' operator.");
        } else {
            System.out.println("s1 and s2 are not equal using '==' operator.");
        }

        if (member1 == member2) {
            System.out.println("member1 and member2 are equal using '==' operator.");
        } else {
            System.out.println("member1 and member2 are not equal using '==' operator.");
        }
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
