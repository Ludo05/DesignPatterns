package com.headsfirst.Stratergy_Pattern.ImplClass;

import com.headsfirst.Stratergy_Pattern.Interface.FlyBehaviour;

//Implements the Flybehaviour to a way a duck can fly
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
