package com.sparta.me.design_patterns.decorator;

public class Italian extends Pizza{

    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
