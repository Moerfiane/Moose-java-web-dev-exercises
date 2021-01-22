package org.launchcode.java.studios.restaurant;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public Date newestMenuDate;
    public ArrayList<MenuItem> menu;

    public Menu(Date newestMenuDate, ArrayList<MenuItem> menuItem) {
        this.newestMenuDate = newestMenuDate;
        this.menu = menuItem;
    }

    public Date getNewestMenuDate() {
        return newestMenuDate;
    }

    public void setNewestMenuDate(Date newestMenuDate) {
        this.newestMenuDate = newestMenuDate;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menu;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menu = menuItem;
    }


    public ArrayList<MenuItem>addItem(MenuItem newItem) {
        this.menu.add(newItem);
        return this.menu;
    }

    public ArrayList<MenuItem>removeItem(MenuItem menuItem) {
        this.menu.remove(menuItem);
        return this.menu;
    }
}