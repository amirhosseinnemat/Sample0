package com.amir.javaSample;

class Student {
    //    instance variable
    String name;
    int age;
    //    static variable
    static String collegeName = "Azad tnb"; //on-line initialization

    //    static initialization block
    static {
        collegeName = "Tehran";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.format("name : %s\nage : %d\ncollege : %s\n\n", name, age, collegeName);
    }
}

public class TestStaticVar {
    public static void main(String[] args) {

        Student st1 = new Student("Ali", 25);
        st1.showInfo();

        // access to static variable/property by class
        Student.collegeName = "Beheshti";

        Student st2 = new Student("Mahdi", 23);
        st2.showInfo();
    }
}
