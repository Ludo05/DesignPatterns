package com.headsfirst.Decorator.PlainDrinks;

import com.headsfirst.Decorator.AbstractClasses.Beverage;

public class Mocha extends Beverage {
    public Mocha(){
        desciption = "Mocha Coffee, ";

    }

    @Override
    public double cost() {
        return .99;
    }
}
