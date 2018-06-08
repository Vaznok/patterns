package com.epam.learning.decorator;

import com.epam.learning.decorator.beverages.Espresso;
import com.epam.learning.decorator.condiments.Mocha;
import com.epam.learning.decorator.condiments.Soy;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage = new Soy(new Mocha(new Mocha(new Espresso())));

        System.out.println(String.format("Beverage content: %s; price: $%s", beverage.getDescription(), beverage.cost()));
    }
}
