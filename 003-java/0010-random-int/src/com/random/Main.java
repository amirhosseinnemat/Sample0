package com.random;

import java.security.SecureRandom;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SecureRandom randnum = new SecureRandom();
        Random randnum2 = new Random();

        //using random class
        System.out.println("*-----Random Number1-----*");
        for (int j = 1; j <= 20; j++) {
            int rand2 = 1 + randnum2.nextInt(6);
            System.out.print("  " + rand2 + "  ");

            if (j % 5 == 0) {
                System.out.println();
            }
        }

        //using java security random class
        System.out.println("*-----Random Number2-----*");
        for (int i = 1; i <= 20; i++) {
            int rand = 1 + randnum.nextInt(6);
            System.out.print("  " + rand + "  ");

            if (i % 5 == 0) {
                System.out.println();
            }
        }

    }
}
