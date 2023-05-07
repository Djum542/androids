package com.example.apptest;

import java.util.ArrayList;
import java.util.List;

public class BeerExcrept {
    List<String> getBrand(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Amber")) {
            brands.add("Jack Amber");
            brands.add("Red More");

        }else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Sout");
        }
        return brands;
    }
}

