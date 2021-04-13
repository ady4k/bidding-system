package model;

import org.jetbrains.annotations.NotNull;

public class Bid {
    private static int bidId = 0;
    private final int currId;
    private double startingPrice;
    private int totalTime;

    // constructori
    public Bid( double startingPrice, int totalTime) {
        this.currId = bidId++;
        this.startingPrice = startingPrice;
        this.totalTime = totalTime;
    }

    // getteri
    public static int getBidId() {
        return bidId;
    }

    public int getCurrId() {
        return currId;
    }

    public double getCurrentPrice() {
        return startingPrice;
    }

    public int getTotalTime() {
        return totalTime;
    }

    // setteri
    public static void setBidId(int bidId) {
        Bid.bidId = bidId;
    }

    public void setCurrentPrice(double currentPrice) {
        this.startingPrice = currentPrice;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
