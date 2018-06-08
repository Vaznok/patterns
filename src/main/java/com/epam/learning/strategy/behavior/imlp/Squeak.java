package com.epam.learning.strategy.behavior.imlp;

import com.epam.learning.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
