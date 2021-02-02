package org.launchcode.java.studios.spinningthediscs;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String aName, int aCapacity, String aContents, String aType) {
        super(aName, aCapacity, aContents, aType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spin CD at 200-500 rpm");
    }

    @Override
    public void storeDisc() {
        System.out.println("Store CD");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
