package com.headsfirst.Stratergy_Pattern.ImplClass;

import com.headsfirst.Stratergy_Pattern.Interface.QuackBehaviour;
//Implements the QuackBehaviour to a way a duck can quack

public class MuteDuck implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute Duck");
    }
}
