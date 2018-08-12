package com.headsfirst.Factory.Abstract;

import java.util.ArrayList;

public abstract class Pizza {
    public  String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
    }

    public void bake(){
        System.out.println("Baking " + name);
    }

    public void cut(){
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Name of pizza " + name);
        stringBuffer.append(" Dough: " + dough + "/n");
        stringBuffer.append(" Sauce: " + sauce + "/n");
        for (int i = 0; i < toppings.size(); i++) {
        stringBuffer.append(toppings.get(i) + "/n");

        }
        return stringBuffer.toString();
    }
}
