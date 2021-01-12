package org.launchcode.java.demos.studio.restaurant;

public class MenuItem {

    private String name;
    private String description;
    private float price;
    private arrayList<String> category;
    private String date;

    public MenuItem(String name, String description, float price, String category, String date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

    }

    public String getName() {
        return name;
    }
    public void setName(String, aName) {
        name = aName;
    }

}
