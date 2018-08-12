package com.headsfirst.Stratergy_Pattern.Ducks;

import com.headsfirst.Stratergy_Pattern.Abstract.Duck;

//Duck has been created using extends Duck with the fly/quack behaviour being injected into the constructor.
public class ModelDuck extends Duck {

    public ModelDuck(){


    }

    @Override
    public void display() {
        System.out.println("this is a model duck!");
    }
}
