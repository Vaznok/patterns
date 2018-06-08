package com.epam.learning.decorator.condiments;

import com.epam.learning.decorator.Beverage;
import com.epam.learning.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
}
