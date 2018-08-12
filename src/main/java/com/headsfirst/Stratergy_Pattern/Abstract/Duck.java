package com.headsfirst.Stratergy_Pattern.Abstract;

import com.headsfirst.Stratergy_Pattern.Interface.FlyBehaviour;
import com.headsfirst.Stratergy_Pattern.Interface.QuackBehaviour;

public abstract class Duck {

    //Favour  composition over inheritance.
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public abstract void display();


    public void performQuack(){
            quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    //Duck has been created with the fly/quack behaviour being injected into the setter method.
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void  setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }


    public void swim(){
        System.out.println("All ducks can swimming.");
    }
}
