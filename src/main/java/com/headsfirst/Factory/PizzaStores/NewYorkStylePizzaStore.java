package com.headsfirst.Factory.PizzaStores;

import com.headsfirst.Factory.Abstract.Pizza;
import com.headsfirst.Factory.Abstract.PizzaStore;
import com.headsfirst.Factory.PizzaTypes.CaliMeatPizza;
import com.headsfirst.Factory.PizzaTypes.CaliSeafoodPizza;
import com.headsfirst.Factory.PizzaTypes.NYCheesePizza;
import com.headsfirst.Factory.PizzaTypes.NYHaiwaiPizza;
import com.headsfirst.Factory.Pizzas.PizzaEnum;


public class NewYorkStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
            if(pizzaEnum.equals(PizzaEnum.CHEESE)){
                return new NYCheesePizza();
            } else if(pizzaEnum.equals(PizzaEnum.HAIWAI)){
                return new NYHaiwaiPizza();
            }
            return null;

        }
}
