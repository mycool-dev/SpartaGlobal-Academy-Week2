package com.sparta.me.design_patterns.decorator.sides;

import com.sparta.me.design_patterns.decorator.Pizza;

public class Chips extends Sides{

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and Chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
