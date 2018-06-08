package com.epam.learning.strategy.behavior.imlp;

import com.epam.learning.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("The duck can't fly");
    }
}
