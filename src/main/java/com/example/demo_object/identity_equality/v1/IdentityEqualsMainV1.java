package com.example.demo_object.identity_equality.v1;

public class IdentityEqualsMainV1 {

    public static void main(String[] args) {

        MemberV1 member1 = new MemberV1(1L, "Member1");
        MemberV1 member2 = new MemberV1(1L, "Member1");
        MemberV1 member3 = member2;

        // 1. equality check using equals method
        if (member1.equals(member2)) {
            System.out.println("member1.equals(member2) : member1 and member2 are equal.");
        } else {
            System.out.println("member1.equals(member2) : member1 and member2 are not equal.");
        }
        // 2. identity check using '==' operator
        if (member1 == member2) {
            System.out.println("member1 == member2 : member1 and member2 are equal.");
        } else {
            System.out.println("member1 == member2 : member1 and member2 are not equal.");
        }
        // 3. member2.equals(member3) check
        if (member2.equals(member3)) {
            System.out.println("member2.equals(member3) : member2 and member3 are equal.");
        } else {
            System.out.println("member2.equals(member3) : member2 and member3 are not equal.");
        }
        // 4. member2 == member3 check
        if (member2 == member3) {
            System.out.println("member2 == member3 : member2 and member3 are equal.");
        } else {
            System.out.println("member2 == member3 : member2 and member3 are not equal.");
        }
    }
}
