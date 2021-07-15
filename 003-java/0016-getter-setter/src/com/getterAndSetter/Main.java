package com.getterAndSetter;

public class Main {

    public static void main(String[] args) {
        Profile person1 = new Profile();
        person1.setName("Amir");
        person1.setAge(26);

        System.out.println("name : " + person1.getName());
        System.out.println("age : " + person1.getAge());
    }
}
