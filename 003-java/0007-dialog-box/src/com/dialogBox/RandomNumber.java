package com.dialogBox;

import java.security.SecureRandom;

public class RandomNumber {

    public static void main(String[] args) {
        SecureRandom randNum = new SecureRandom();

        for (int i = 1; i <= 12; i++) {
            int value = randNum.nextInt(7);
            System.out.print(" " + value);

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }

}
