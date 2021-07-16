package com.amir.javaSample;

public class ConstructorOverload {

    private String name;
    private int age;

    public ConstructorOverload(String name){
        this.name = name;
    }

    public ConstructorOverload(String name, int age) {
        this(name);
        this.age = age;
    }
}
