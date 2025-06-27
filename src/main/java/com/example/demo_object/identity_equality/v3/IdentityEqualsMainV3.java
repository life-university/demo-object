package com.example.demo_object.identity_equality.v3;

import com.example.demo_object.identity_equality.v1.MemberV1;

public class IdentityEqualsMainV3 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        MemberV1 member1 = new MemberV1(1L, "Member1");
        MemberV1 member2 = new MemberV1(1L, "Member1");

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal using 'equals' operator.");
        } else {
            System.out.println("s1 and s2 are not equal using 'equals' operator.");
        }

        if (member1.equals(member2)) {
            System.out.println("member1 and member2 are equal using 'equals' operator.");
        } else {
            System.out.println("member1 and member2 are not equal using 'equals' operator.");
        }
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
