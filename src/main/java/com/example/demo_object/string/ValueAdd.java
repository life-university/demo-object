package com.example.demo_object.string;

public class ValueAdd {

    private int value;

    public ValueAdd add(int value) {
        this.value += value;
        return this;
    }

    public int getValue() {
        return value;
    }
}
