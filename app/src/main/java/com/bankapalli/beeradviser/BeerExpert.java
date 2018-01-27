package com.bankapalli.beeradviser;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Bankapalli on 25/01/18.
 */

public class BeerExpert {
    List<String> getBrands (String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
