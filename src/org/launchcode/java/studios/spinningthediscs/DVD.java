package org.launchcode.java.studios.spinningthediscs;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String aName, int aCapacity, String aContents, String aType) {
        super(aName, aCapacity, aContents, aType);
    }
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm");
    }

    @Override
    public void storeDisc() {
        System.out.println("Store data");
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones

    //  need to be declared separately.

}
