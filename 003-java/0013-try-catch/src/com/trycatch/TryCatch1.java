package com.trycatch;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        try {
            int n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Oops! Please enter a valid number!");
        }
    }
}
