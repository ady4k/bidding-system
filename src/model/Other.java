package model;

import collections.service.ListService;

import java.util.List;

public class Other extends Location{
    private int quantity;
    private double weight;
    private String packagingType;

    private static final ListService lstSrv = new ListService();

    // constructori
    public Other(String productName, String category, double startingPrice, String location, List<String> deliveryLocations, int quantity, double weight, String packagingType) {
        super(productName, category, startingPrice, location, deliveryLocations);
        this.quantity = quantity;
        this.weight = weight;
        this.packagingType = packagingType;
        lstSrv.addProduct(this);
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

    // override
    @Override
    public String toString() {
        return super.toString() +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", packagingType='" + packagingType + '\'' +
                "}\n";
    }
}