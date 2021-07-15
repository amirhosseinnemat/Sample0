package com.constructor;

public class Main {

    public static void main(String[] args) {

        Country country = new Country("europe");
        country.showInfo();
        
        Country country2 = new Country(60000000,"europe");
        country2.showInfo();

    }
}
