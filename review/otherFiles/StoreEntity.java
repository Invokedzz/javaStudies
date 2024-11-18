package review.otherFiles;

public class StoreEntity {

    private String productName;

    private double productPrice;

    public StoreEntity (String productName, double productPrice) {

        this.productName = productName;

        this.productPrice = productPrice;

    }

    public String toString () {

        return productName + " " + "$" + productPrice;

    }

    public String getProductName () {
        return productName;
    }

    public double getProductPrice () {
        return productPrice;
    }

}
