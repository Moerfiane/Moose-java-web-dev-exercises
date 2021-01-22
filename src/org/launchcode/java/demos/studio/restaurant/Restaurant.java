package org.launchcode.java.demos.studio.restaurant;

public class Restaurant {
    public static void main(String[] args){
       // instance of a class
       MenuItem item1 = new MenuItem("pizza", "cheese", 10.99f, "entree", "01/21/2018", false);
       System.out.println(item1.getDate());

        MenuItem item2 = new MenuItem("salad", "appetizer", 8.99f, "starter", "12/21/2019", false);
        System.out.println(item1.getDescription());


    }
}
