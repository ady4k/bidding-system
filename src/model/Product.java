package model;

public class Product extends Bid{
    private int productId;
    private String productName;
    // constructori


    public Product(int userId, String name, int age, int bidId, int currentPrice, int timeRemaining, int productId, String productName) {
        super(userId, name, age, bidId, currentPrice, timeRemaining);
        this.productId = productId;
        this.productName = productName;
    }

    // getteri
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    // setteri
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
