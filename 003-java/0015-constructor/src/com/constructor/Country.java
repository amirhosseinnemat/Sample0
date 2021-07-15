package com.constructor;

public class Country {
    private String countryName;
    private int population;
    private String location;

    public Country() {
        countryName = "Italy";
    }

    public Country(String location) {
        this();
        this.location = location;
    }

    public Country(int population, String location) {
        this(location);
        this.population = population;
    }

    public void showInfo() {
        System.out.format("Country name : %s\nLocation : %s\nPopulation : %d\n\n", countryName, location, population);
    }
}
