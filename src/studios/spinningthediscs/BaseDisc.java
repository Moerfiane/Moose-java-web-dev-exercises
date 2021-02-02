package studios.spinningthediscs;

public abstract class BaseDisc {

    private int data;

    private String name;

    private int capacity;

    private String discType;

    public BaseDisc (int data, String name, int capacity, String discType) {

        this.data = data;
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    private void getDiscInfo() {
        System.out.println("Disc Capacity: " + capacity + "\n Disc Type: "+ discType);
    }

}
