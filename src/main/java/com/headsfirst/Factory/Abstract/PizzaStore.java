package com.headsfirst.Factory.Abstract;

import com.headsfirst.Factory.Abstract.Pizza;
import com.headsfirst.Factory.Pizzas.PizzaEnum;
import com.headsfirst.Factory.Pizzas.SimplePizzaFactory;

public abstract class PizzaStore {


    public Pizza orderPizza(PizzaEnum pizzaEnum){
      Pizza pizza = createPizza(pizzaEnum);
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      return pizza;
    }

    public abstract Pizza createPizza(PizzaEnum pizzaEnum);
}
