package model;

import java.util.List;

public class Vehicle extends Location{
    private int kW;
    private int maxSpeed;
    private double engineCapacity;
    private boolean hasForcedInduction;

    // constructori
    public Vehicle(String productName, String category, double startingPrice, String location, List<String> deliveryLocations, int kW, int maxSpeed, double engineCapacity, boolean hasForcedInduction) {
        super(productName, category, startingPrice, location, deliveryLocations);
        this.kW = kW;
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
        this.hasForcedInduction = hasForcedInduction;
    }

    // getteri
    public int getkW() {
        return kW;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isForceInducted() {
        return hasForcedInduction;
    }

    // setteri
    public void setkW(int kW) {
        this.kW = kW;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setForceInducted(boolean forceInducted) {
        hasForcedInduction = forceInducted;
    }
}
