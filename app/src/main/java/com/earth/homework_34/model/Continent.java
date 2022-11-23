package com.earth.homework_34.model;

import java.io.Serializable;

public class Continent implements Serializable {

    int continent;
    String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Continent(int continent, String countryName) {
        this.continent = continent;
        this.countryName = countryName;
    }



    public int getContinent() {
        return continent;
    }

    public void setContinent(int continent) {
        this.continent = continent;
    }
}