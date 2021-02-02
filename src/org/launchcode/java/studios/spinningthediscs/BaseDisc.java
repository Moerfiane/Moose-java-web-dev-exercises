package org.launchcode.java.studios.spinningthediscs;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String contents;
    private String type;

    public BaseDisc(String aName, int aCapacity, String aContents, String aType){
        this.name = aName;
        this.capacity = aCapacity;
        this.contents = aContents;
        this.type = aType;
    }
}
