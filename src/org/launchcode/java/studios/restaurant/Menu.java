package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public Date newestMenuDate;
    public ArrayList<MenuItem> menuItem;

    public Menu(Date newestMenuDate, ArrayList<MenuItem> menuItem) {
        this.newestMenuDate = newestMenuDate;
        this.menuItem = menuItem;
    }

    public Date getNewestMenuDate() {
        return newestMenuDate;
    }

    public void setNewestMenuDate(Date newestMenuDate) {
        this.newestMenuDate = newestMenuDate;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
}