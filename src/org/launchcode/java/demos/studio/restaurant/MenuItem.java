package org.launchcode.java.demos.studio.restaurant;

public class          MenuItem {

    private String name;
    private String description;
    private float price;
    private String category;
    private String date;

    public MenuItem(String name, String description, float price, String category, String date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = date;

    }

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDiscription) {description = aDiscription; }

    public float getPrice() {
        return price;
    }
    public void setPrice(float aPrice) {price = aPrice; }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        name = aCategory;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String aDate) {
        name = aDate;
    }


}
