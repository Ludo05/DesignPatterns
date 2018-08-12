package com.headsfirst.Collector.Impl;

import com.headsfirst.Collector.Inteface.Iterator;

public class DinnerMenuIterator implements Iterator {
    String[] items;
    int position = 0;


    public DinnerMenuIterator(String[] items){
        this.items = items;
    }




    @Override
    public String next() {
    String menuItem = items[position];
    position++;
    return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
