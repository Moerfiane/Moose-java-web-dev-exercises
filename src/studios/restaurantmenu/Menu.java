package studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Menu newMenu = new Menu();

    private Date dateUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    //constructor
    public Menu(Date aDate, ArrayList<MenuItem> anItem) {
        this.dateUpdated = aDate;
        this.items = anItem;
    }

    //getters and setters
    public Date getDateUpdated(){
        return dateUpdated;
    }

    public void setDateUpdated(Date aDateUpdated){
        dateUpdated = aDateUpdated;
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public void setItems(ArrayList<MenuItem> aItems){
        items = aItems;
    }

}
