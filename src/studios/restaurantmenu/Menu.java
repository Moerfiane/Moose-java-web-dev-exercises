package studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Menu newMenu = new Menu();

    private Date dateUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();
    private boolean isUpdated = true;

    public double getMenu () {

    }

    public Menu(Date aDate, ArrayList<MenuItem> anItem) {
        this.dateUpdated = aDate;
        this.items = anItem;
    }

}
