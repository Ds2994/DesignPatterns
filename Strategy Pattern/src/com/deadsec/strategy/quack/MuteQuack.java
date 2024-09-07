package com.deadsec.strategy.quack;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}