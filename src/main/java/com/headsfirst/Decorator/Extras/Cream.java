package com.headsfirst.Decorator.Extras;

import com.headsfirst.Decorator.AbstractClasses.Beverage;

public class Cream extends Beverage {
    private Beverage beverage;

    public Cream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ":-Cream";
    }

    @Override
    public double cost() {
        return .60 + beverage.cost();
    }
}
