package com.headsfirst.Factory.Pizzas;

import com.headsfirst.Factory.Abstract.Pizza;
import com.headsfirst.Factory.PizzaTypes.NYCheesePizza;
import com.headsfirst.Factory.PizzaTypes.NYHaiwaiPizza;
import com.headsfirst.Factory.PizzaTypes.CaliMeatPizza;
import com.headsfirst.Factory.PizzaTypes.CaliSeafoodPizza;

public class SimplePizzaFactory {

    public Pizza createPizzaFactory(PizzaEnum type){
        Pizza pizza = null;
        if(type.equals(PizzaEnum.CHEESE)){
            pizza = new NYCheesePizza();
        } else if(type.equals(PizzaEnum.HAIWAI)){
            pizza = new NYHaiwaiPizza();
        } else if(type.equals(PizzaEnum.MEASTFEAST)){
            pizza = new CaliMeatPizza();
        } else if(type.equals(PizzaEnum.SEAFOOD)){
            pizza = new CaliSeafoodPizza();

        }
        return pizza;
    }
}
