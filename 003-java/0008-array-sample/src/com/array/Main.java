package com.array;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numArray = {12, 10, 5, 6, 71};
        Arrays.sort(numArray);
//        first way to showing array is use toString
        System.out.println(Arrays.toString(numArray));
//        second way is to use foreach
        for (int adad : numArray) {
            System.out.print(adad + ", ");
        }
        System.out.println();


        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[0] + numArray[1]);

        System.out.println("--------------------");
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < numArray.length; i++)
            System.out.printf("%3d%8d%n", i, numArray[i]);
        System.out.println("--------------------");

    }
}
