package Bussiness;

public class Product {
    private String name;
    private int requiredWorkers;
    private long requieredWork;

    public Product(String name, int requiredWorkers, long requieredWork) {
        this.name = name;
        this.requiredWorkers = requiredWorkers;
        this.requieredWork = requieredWork;
    }



    public String getName() {
        return name;
    }

    public int getWorkers() {
        return requiredWorkers;
    }

    public long getWork() {
        return requieredWork;
    }
}
