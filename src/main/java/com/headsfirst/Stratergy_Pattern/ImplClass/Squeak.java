package com.headsfirst.Stratergy_Pattern.ImplClass;

import com.headsfirst.Stratergy_Pattern.Interface.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
