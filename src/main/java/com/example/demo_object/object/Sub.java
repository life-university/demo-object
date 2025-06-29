package com.example.demo_object.object;

// 명시적으로 `Super` 클래스를 상속 받았기 때문에 Object 클래스는 상속되지 않는다.
public class Sub extends Super {

    public void subMethod() {
        System.out.println("Sub.subMethod");
    }
}
