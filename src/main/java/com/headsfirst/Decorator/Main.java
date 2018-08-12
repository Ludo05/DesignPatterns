package com.headsfirst.Decorator;

import com.headsfirst.Decorator.AbstractClasses.Beverage;
import com.headsfirst.Decorator.Extras.Cream;
import com.headsfirst.Decorator.Extras.Milk;
import com.headsfirst.Decorator.PlainDrinks.Mocha;


/**
 * Decorator patterns attaches responsilibities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for additional functionality.
 *
 *
 * **/
public class Main {

    public static void main(String[] args) {
            Beverage Mocha = new Mocha();
        Mocha = new Milk(Mocha);
        Mocha = new Cream(Mocha);

        System.out.println(Mocha.getDescription() + " £" + Mocha.cost());
    }
}
