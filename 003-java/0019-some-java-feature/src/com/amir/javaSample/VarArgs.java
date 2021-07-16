package com.amir.javaSample;

public class VarArgs {
    public static void print(String... params) {
        String[] array = params;
        System.out.println(array.length);
        for (String n : params) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        print();
        print("Ali");
        print("Amir", "Sajjad", "Mahdi");

    }
}
