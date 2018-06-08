package com.epam.learning.decorator.beverages;

import com.epam.learning.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
