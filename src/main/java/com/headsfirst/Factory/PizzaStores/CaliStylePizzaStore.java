package com.headsfirst.Factory.PizzaStores;

import com.headsfirst.Factory.Abstract.Pizza;
import com.headsfirst.Factory.Abstract.PizzaStore;
import com.headsfirst.Factory.PizzaTypes.CaliMeatPizza;
import com.headsfirst.Factory.PizzaTypes.CaliSeafoodPizza;
import com.headsfirst.Factory.PizzaTypes.NYCheesePizza;
import com.headsfirst.Factory.PizzaTypes.NYHaiwaiPizza;
import com.headsfirst.Factory.Pizzas.PizzaEnum;

public class CaliStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        if(pizzaEnum.equals(PizzaEnum.MEASTFEAST)){
            return new CaliMeatPizza();
        } else if(pizzaEnum.equals(PizzaEnum.SEAFOOD)){
            return new CaliSeafoodPizza();
        }
        return null;

    }
}
