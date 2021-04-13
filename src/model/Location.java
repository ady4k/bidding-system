package model;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public abstract class Location extends Product{
    private String location;
    private List<String> deliveryLocations = new ArrayList<>();
    // locatia de unde se vinde produsul
    // adresa specifica sau in mare tara, etc.
    // fiecare obiect are o lista de tari unde poate fi trimis / vandut

    // constructori
    public Location(String productName, String category, double startingPrice, String location_, List<String> deliveryLocations_) {
        super(productName, category, startingPrice);
        this.location = location_;
        this.deliveryLocations = deliveryLocations_;
    }

    // getteri
    public String getLocation() {
        return location;
    }

    public List<String> getDeliveryLocations() {
        return deliveryLocations;
    }

    // setteri
    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeliveryLocations(List<String> deliveryLocations) {
        this.deliveryLocations = deliveryLocations;
    }
}
