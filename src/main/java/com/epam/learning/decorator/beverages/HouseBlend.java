package com.epam.learning.decorator.beverages;

import com.epam.learning.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
