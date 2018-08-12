package com.headsfirst.Stratergy_Pattern;

import com.headsfirst.Stratergy_Pattern.Abstract.Duck;
import com.headsfirst.Stratergy_Pattern.Ducks.MallardDuck;
import com.headsfirst.Stratergy_Pattern.Ducks.ModelDuck;
import com.headsfirst.Stratergy_Pattern.ImplClass.FlyNoWay;
import com.headsfirst.Stratergy_Pattern.ImplClass.Squeak;

public class Main {

    public static void main(String[] args) {
            Duck mallard = new MallardDuck();
            mallard.setFlyBehaviour(new FlyNoWay());
            mallard.performFly();
            mallard.setQuackBehaviour(new Squeak());
            mallard.performQuack();

            Duck modelDuck = new ModelDuck();
            modelDuck.setFlyBehaviour(new FlyNoWay());
            modelDuck.performFly();
            mallard.display();
    }
}
