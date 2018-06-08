package com.epam.learning.strategy;

import com.epam.learning.strategy.behavior.imlp.FlyWithWings;
import com.epam.learning.strategy.behavior.imlp.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck view");
    }
}
