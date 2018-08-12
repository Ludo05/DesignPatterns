package com.headsfirst.Collector;

import com.headsfirst.Collector.Impl.DinnerMenu;
import com.headsfirst.Collector.Impl.PancakeHouseMenu;
import com.headsfirst.Collector.Inteface.Iterator;

public class Cafe {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Iterator pancakeHouse = pancakeHouseMenu.createIterator();
        Iterator dinnerMen = dinnerMenu.createIterator();


        System.out.println("PANCAKE HOUSE MENU----");
        printMenu(pancakeHouse);
        System.out.println("DINNER MENU---");
        printMenu(dinnerMen);

    }




    public static void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            String menuitem =(String)iterator.next();
            System.out.println(menuitem);
        }
    }
}
