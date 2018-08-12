package com.headsfirst.Decorator.AbstractClasses;

public abstract class Beverage {
    public String desciption = "Unknown Beverage";


    public String getDescription(){
        return desciption;
    }


    public abstract double cost();
}
