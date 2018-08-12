package com.headsfirst.Factory.PizzaTypes;

import com.headsfirst.Factory.Abstract.Pizza;

public class CaliSeafoodPizza extends Pizza {
    public CaliSeafoodPizza(){
        name = "Down Under";
        dough = "Thin Pan";
        sauce = "Fishy";
        toppings.add("Prawns");
        toppings.add("Fish");
    }
}
