package org.launchcode.java.studios.restaurant;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem>arrayList = new ArrayList(Arrays.asList("Cheese", "Meat", "Sugar"));
        //arrayList<Menu>arrayList = new Menu(addItem());
        System.out.println(arrayList);
    }
}
