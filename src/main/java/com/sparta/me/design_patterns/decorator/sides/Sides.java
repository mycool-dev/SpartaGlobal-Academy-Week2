package com.sparta.me.design_patterns.decorator.sides;

import com.sparta.me.design_patterns.decorator.Pizza;

public abstract class Sides extends Pizza{
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
