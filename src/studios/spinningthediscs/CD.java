package studios.spinningthediscs;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD (int data, String name, int capacity, String discType) {
        super(data, name, capacity, discType);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at 200-500 RPMs.");
    }

    @Override
    public void readData() {
        System.out.println("A CD reads less data than a DVD.");
    }



}
