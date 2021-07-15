package com.amir.javaSample;


public class StaticMethod {


    static int cube(int n) {
        return n * n * n;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        //  we can use static method without instantiation
        System.out.println(StaticMethod.cube(3));
        System.out.println(cube(3)); //also in a class we don't need it call it with class

        //  for instance method we need creat an instance of class
        StaticMethod s = new StaticMethod();
        s.sayHello();
    }
}
