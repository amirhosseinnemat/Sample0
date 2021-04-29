package com.constructor;

public class Person {

    private String name;
    private int age;
    private String family;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name : " + name + "\nAge : " + age);
    }

    public Person(String name, int age, String family) {
        this(name, age);
        this.family = family;
        System.out.println("Family : " + family);
    }
}
