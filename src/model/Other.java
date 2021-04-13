package model;

import java.util.List;

public class Other extends Location{
    private int quantity;
    private double weight;
    private String packagingType;

    // constructori
    public Other(String productName, String category, double startingPrice, String location, List<String> deliveryLocations, int quantity, double weight, String packagingType) {
        super(productName, category, startingPrice, location, deliveryLocations);
        this.quantity = quantity;
        this.weight = weight;
        this.packagingType = packagingType;
    }

    // getteri
    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public String getPackagingType() {
        return packagingType;
    }

    // setteri
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }
}
