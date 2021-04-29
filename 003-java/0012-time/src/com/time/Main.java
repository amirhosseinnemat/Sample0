package com.time;


public class Main {

    public static void main(String[] args) {
        Time1 timeSet = new Time1();
        displayTime("After the object created", timeSet);
        System.out.println();

        timeSet.setTime(14, 20, 11);
        displayTime("After setTime", timeSet);
        System.out.println();

        try {
            timeSet.setTime(90, 90, 90);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s", e.getMessage());
        }

        displayTime("After set invalid time", timeSet);
    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time : %s%nStandard time :  %s%n", header, t.toUniversalString(), t.toString());
    }
}
