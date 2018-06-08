package com.epam.learning.strategy;

import com.epam.learning.strategy.behavior.imlp.FlyNoWay;
import com.epam.learning.strategy.behavior.imlp.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
