package com.deadsec.strategy;

import com.deadsec.strategy.fly.FlyWithWings;
import com.deadsec.strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("A Read Mallard Duck");
    }
}
