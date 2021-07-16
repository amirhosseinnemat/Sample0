package com.amir.javaSample;

public class Main {

    void sayHello() {
        System.out.println("Hello");
    }

    void saySomething() {
        //use this keyword to use method sayHello
        this.sayHello();
        System.out.println("GoodBye");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.sayHello();
        m.saySomething();
    }
}
