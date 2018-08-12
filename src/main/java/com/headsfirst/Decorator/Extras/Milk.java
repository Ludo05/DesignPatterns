package com.headsfirst.Decorator.Extras;

import com.headsfirst.Decorator.AbstractClasses.Beverage;
import com.headsfirst.Decorator.AbstractClasses.CondimentBeverages;

public class Milk extends CondimentBeverages {
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .60 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ":-Milk";
    }
}

