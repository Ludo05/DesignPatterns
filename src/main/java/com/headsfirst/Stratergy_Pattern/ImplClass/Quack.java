package com.headsfirst.Stratergy_Pattern.ImplClass;

import com.headsfirst.Stratergy_Pattern.Interface.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
