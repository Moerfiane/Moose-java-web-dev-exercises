package studios.spinningthediscs;


    public class LP extends BaseDisc implements OpticalDisc {

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.

        public LP (int data, String name, int capacity, String discType) {
            super(data, name, capacity, discType);
        }

        // TODO: Implement your custom interface.

        @Override
        public void spinDisc() {
            System.out.println("An LP spins at 33 or 78 RPMs.");
        }

        @Override
        public void readData() {
            System.out.println("An LP reads analog data");
        }



    }


