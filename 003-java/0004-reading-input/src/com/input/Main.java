package com.input;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? : ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello" + " " + name + " " + "Welcome to the class");

    }
}
