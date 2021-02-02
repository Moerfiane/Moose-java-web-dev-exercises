package studios.spinningthediscs;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD (int data, String name, int capacity, String discType) {
        super(data, name, capacity, discType);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at 570-1600 RPMs.");
    }

    @Override
    public void readData() {
        System.out.println("A DVD reads more data than a CD.");
    }

}
