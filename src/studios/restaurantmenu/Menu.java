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

    //instance methods
    public void removeItem(MenuItem itemToRemove){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(itemToRemove)) {
                items.remove(i);
            }
        }
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public boolean isNew(MenuItem item){
        return item.getIsNew();
    }

    public Date lastUpdated() {
        return this.dateUpdated;
    }

//    public void printMenu(){
//        for ()
//            items(i).toString();
//    }

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
