package com.headsfirst.Factory.PizzaTypes;

import com.headsfirst.Factory.Abstract.Pizza;

public class NYHaiwaiPizza extends Pizza {
    public NYHaiwaiPizza(){
        name = "Haiwai Pizza";
        dough = "Deep Pan";
        sauce = "BBQ";
        toppings.add("Sundress");
        toppings.add("Pineapple");
    }
}
