package org.launchcode.java.demos.studio.restaurant;

public class MenuItem {

    private String name;
    private String description;
    private float price;
    private String category;
    private String date;
    private boolean isNew;

    public MenuItem(String name, String description, float price, String category, String date, boolean isNew) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = date;
        this.isNew = isNew;
    }
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        this.name = aName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String aDiscription) {this.description = aDiscription; }
    public float getPrice() {
        return price;
    }
    public void setPrice(float aPrice) {this.price = aPrice; }
    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) { this.name = aCategory;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String aDate) { this.name = aDate;
    }
    public Boolean getIsNew() {return isNew; }
    public void setIsNew(boolean aIsNew) { this.isNew = aIsNew;
    }


}
