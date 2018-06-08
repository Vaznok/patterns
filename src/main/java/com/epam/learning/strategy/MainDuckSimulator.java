package com.epam.learning.strategy;

import com.epam.learning.strategy.behavior.imlp.Squeak;

public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("change voice");
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
    }
}
