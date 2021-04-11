package com.lib;

public class LibUser {
    private String name, family;
    private int userId, age;

    public void setName(String n) {
        name = n;
    }

    public void setFamily(String f) {
        family = f;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setUserId(int u) {
        userId = u;
    }

    public void showInfo() {
        System.out.println("name : " + name);
        System.out.println("family: " + family);
        System.out.println("age: " + age);
        System.out.println("userId: " + userId);
    }
}
