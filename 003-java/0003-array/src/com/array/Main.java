package com.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] number = new int[5];
        number[0] = 20;
        number[2] = 14;
        number[3] = 15;

        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        String[] names = {"Ali","Amir","Ahmad","Javad"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}
