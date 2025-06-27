package com.example.demo_object.identity_equality.v4;

public class IdentityEqualsMainV4 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        MemberV4 member1 = new MemberV4(1L, "Member1");
        MemberV4 member2 = new MemberV4(1L, "Member1");

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
