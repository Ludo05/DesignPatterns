package com.headsfirst.Singleton;

public class Singleton {
    private static Singleton Uniquesingleton;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (Uniquesingleton == null){
            Uniquesingleton = new Singleton();
        }
    return Uniquesingleton;
    }

    public String getDesc(){
        return "I am a classic singleton";
    }
}
