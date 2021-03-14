package model;

public class Bid extends User{
    private int bidId;
    private int currentPrice;
    private int timeRemaining;


    // constructori

    public Bid(int userId, String name, int age, int bidId, int currentPrice, int timeRemaining) {
        super(userId, name, age);
        this.bidId = bidId;
        this.currentPrice = currentPrice;
        this.timeRemaining = timeRemaining;
    }

    // getteri
    public int getBidId() {
        return bidId;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    // setteri
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
}
