package com.headsfirst.Factory.PizzaTypes;

import com.headsfirst.Factory.Abstract.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza(){
        name = "NYCheesePizza";
        dough = "Deep Pan";
        sauce = "BBQ";
        toppings.add("String cheese");
        toppings.add("mac and cheese");
    }
}
