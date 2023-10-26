package org.example.warehouse;

public class Warehouse {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warehouse(String name) {
        this.name = name;
    }

    public Warehouse() {
    }
    public static Warehouse getInstance(){
        throw new IllegalArgumentException();
    }

    public static Warehouse getInstance(String name) {
        return new Warehouse(name);
    }
}
