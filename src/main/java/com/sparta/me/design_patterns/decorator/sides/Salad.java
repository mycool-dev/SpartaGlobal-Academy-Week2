package com.sparta.me.design_patterns.decorator.sides;

import com.sparta.me.design_patterns.decorator.Pizza;

public class Salad extends Sides{
    public Salad(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
