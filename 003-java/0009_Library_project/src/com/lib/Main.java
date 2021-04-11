package com.lib;

public class Main {

    public static void main(String[] args) {

        LibUser user1 = new LibUser();
        user1.setName("Ali");
        user1.setFamily("Farahani");
        user1.setAge(24);
        user1.setUserId(12544);

        user1.showInfo();
        System.out.println("");

        Library lib = new Library("The little prince","Antoine de Saint-Exupéry",23000);
        lib.showInfo();
    }
}
