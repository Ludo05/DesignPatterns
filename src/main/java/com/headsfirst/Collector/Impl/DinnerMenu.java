package com.headsfirst.Collector.Impl;

import com.headsfirst.Collector.Inteface.Iterator;
import com.headsfirst.Collector.Inteface.Menu;

public class DinnerMenu implements Menu {
    public static final int NUM = 6;
    int numberOfItems = 0;
    String[] arr;

    public DinnerMenu(){
        arr = new String[NUM];

        addItem("Chicken");
        addItem("Rice");
        addItem("Beef");
        addItem("Eggs");
        addItem("Ice-Cream");

    }



    public void addItem(String name){
        if(numberOfItems >= NUM){
            System.err.println("Sorry menu is full");
        }
        arr[numberOfItems] = name;
        numberOfItems++;
    }

    public String[] getItems(){
        return  arr;
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(arr);
    }

    public String toString(){
        return "Dinner Menu";
    }
}
