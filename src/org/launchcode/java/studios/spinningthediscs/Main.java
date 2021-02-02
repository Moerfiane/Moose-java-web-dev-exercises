package org.launchcode.java.studios.spinningthediscs;

public class Main {
    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
            CD cd = new CD("Beyonce",10,"Beyonce Album","rom");
            DVD dvd = new DVD("Blazing Saddles",80,"Chapters","rom");
        // TODO: Call each CD and DVD method to verify that they work as expected.
            cd.spinDisc();
            dvd.spinDisc();
            cd.storeDisc();
            dvd.storeDisc();
        System.out.println(cd.printInfo());
        System.out.println(dvd.printInfo());
    }
}
