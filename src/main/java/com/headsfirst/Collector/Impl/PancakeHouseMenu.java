package com.headsfirst.Collector.Impl;

import com.headsfirst.Collector.Inteface.Iterator;
import com.headsfirst.Collector.Inteface.Menu;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    private ArrayList<String> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

        addItem("Cake");
        addItem("Toffee");
        addItem("Chocolate");
        addItem("Waffles");



    }

    public void addItem(String name){
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems(){
        return  menuItems;
    }
    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString(){
        return "Pancake House Menu";
    }
}
