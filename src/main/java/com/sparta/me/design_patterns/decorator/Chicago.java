package com.sparta.me.design_patterns.decorator;

import com.sparta.me.design_patterns.decorator.sides.Chips;
import com.sparta.me.design_patterns.decorator.sides.Salad;

public class Chicago extends Pizza{

    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
