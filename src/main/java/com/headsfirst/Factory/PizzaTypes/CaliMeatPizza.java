package com.headsfirst.Factory.PizzaTypes;

import com.headsfirst.Factory.Abstract.Pizza;

public class CaliMeatPizza extends Pizza {
    public CaliMeatPizza(){
        name = "Meat Pizza";
        dough = "Deep Pan";
        sauce = "BBQ";
        toppings.add("Beef");
        toppings.add("Ham");
        toppings.add("Pepperoni");
    }

    public void cut(){
        System.out.println("Cut pizzas CaliStyle");
    }
}
