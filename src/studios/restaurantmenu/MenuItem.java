package studios.restaurantmenu;

public class MenuItem {
    //MenuItem newMenuItem = new MenuItem();

    //instance fields
    private double price;
    private String name;
    private String category;
    private String description;
    private boolean isNew;

    //constructor
    public MenuItem(double price, String description, String category, String name, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.isNew = isNew;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public String getCategory() {
        return category;
    }

}

