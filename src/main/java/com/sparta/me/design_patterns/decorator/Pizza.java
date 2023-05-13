package com.sparta.me.design_patterns.decorator;

public abstract class Pizza {
    private String description;
    private double cost;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
