package com.epam.learning.strategy.behavior.imlp;

import com.epam.learning.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly using wings!");
    }
}
