package model;

import java.util.Arrays;

public class Seller extends User{
    private int [] bids;
    // permisiuni la licitatiile proprii (nu poate sterge / modifica dupa plasare)
    // permisiuni la produsele proprii
    // lista cu licitatii active

    // constructori
    public Seller(String name, int age, String location, int[] bids) {
        super(name, age, location);
        this.bids = bids;
    }

    // getteri
    public int[] getBids() {
        return bids;
    }

    // setteri
    public void setBids(int[] bids) {
        this.bids = bids;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "bids=" + Arrays.toString(bids) +
                '}';
    }
}