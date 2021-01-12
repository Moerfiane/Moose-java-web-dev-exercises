package studios.restaurantmenu;

public class MenuItem {
    //MenuItem newMenuItem = new MenuItem;

    //instance fields
    private double price ;
    private String name;
    private String category;
    private String description;
    boolean isNew;

    //constructor
    public MenuItem(double price, String description, String category, String name, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.isNew = isNew;

    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void isNew(boolean isNew) {
        this.isNew = isNew;
    }

        }

