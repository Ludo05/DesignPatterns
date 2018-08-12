package com.headsfirst.Collector.Impl;

import com.headsfirst.Collector.Inteface.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<String> PMenu;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> PMenu){
        this.PMenu = PMenu;
    }



    @Override
    public String next() {

        String menuItem =  PMenu.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= PMenu.size()) {
            return false;
        } else {
            return true;
        }
    }
}
