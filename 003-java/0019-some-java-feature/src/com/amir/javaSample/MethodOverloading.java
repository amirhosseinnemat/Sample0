package com.amir.javaSample;

public class MethodOverloading {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.sayHello();
        m.sayHello("Ali");

    }
}
