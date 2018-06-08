package com.epam.learning.strategy.behavior.imlp;

import com.epam.learning.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
