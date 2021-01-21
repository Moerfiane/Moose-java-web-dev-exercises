package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class Menu {
    public Date newestMenuDate;
    public MenuItem menuItem;

    public Menu(Date newestMenuDate, MenuItem menuItem) {
        this.newestMenuDate = newestMenuDate;
        this.menuItem = menuItem;
    }

    public Date getNewestMenuDate() {
        return newestMenuDate;
    }

    public void setNewestMenuDate(Date newestMenuDate) {
        this.newestMenuDate = newestMenuDate;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
}
