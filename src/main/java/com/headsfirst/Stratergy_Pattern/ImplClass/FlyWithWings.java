package com.headsfirst.Stratergy_Pattern.ImplClass;

import com.headsfirst.Stratergy_Pattern.Interface.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Can fly!");
    }
}
