package studios.spinningthediscs;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD(700, "Purple Rain", 800, "CD-");
        DVD myDVD = new DVD(1600, "Moulin Rouge", 2400, "DVD-R");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisc();
        myCD.readData();
        myDVD.spinDisc();
        myDVD.readData();
    }
}
