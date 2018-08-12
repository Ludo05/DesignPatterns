package com.headsfirst.Factory;

import com.headsfirst.Factory.Abstract.Pizza;
import com.headsfirst.Factory.Abstract.PizzaStore;
import com.headsfirst.Factory.PizzaStores.CaliStylePizzaStore;
import com.headsfirst.Factory.PizzaStores.NewYorkStylePizzaStore;
import com.headsfirst.Factory.Pizzas.PizzaEnum;

public class PizzaDriveThruTest {

    public static void main(String[] args) {

        /*
        //Create the Pizza Factory
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        //Create a Pizza store passing in the factory to create pizzas
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);


        pizzaStore.orderPizza(PizzaEnum.CHEESE);
        */

        PizzaStore cali = new CaliStylePizzaStore();
        PizzaStore NY = new NewYorkStylePizzaStore();


     Pizza pizza = NY.orderPizza(PizzaEnum.HAIWAI);
        System.out.println("Ordered: " + pizza.getName());


     Pizza pizza1 = cali.orderPizza(PizzaEnum.MEASTFEAST);
        System.out.println("Ordered: " + pizza1.getName() );
    }
}
