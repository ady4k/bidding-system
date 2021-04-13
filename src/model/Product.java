package model;

public abstract class Product {
    private static int productId = 0;
    private final int currId;
    private String productName;
    private String category;
    private double buyoutPrice;

    // constructori
    public Product(String productName, String category, double buyoutPrice) {
        this.currId = productId++;
        this.productName = productName;
        this.category = category;
        this.buyoutPrice = buyoutPrice;
    }

    // getteri
    public static int getProductId() {
        return productId;
    }

    public int getCurrId() {
        return currId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getStartingPrice() {
        return buyoutPrice;
    }

    // setteri
    public static void setProductId(int productId) {
        Product.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStartingPrice(double startingPrice) {
        this.buyoutPrice = startingPrice;
    }
}



