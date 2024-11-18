package review.otherFiles;

import java.util.Arrays;

public class StoreEntity {

    private String productName;

    private double [] productPrice;

    private double totalResult;

    public StoreEntity (String [] productName, double [] productPrice) {

        this.productName = Arrays.toString(productName);

        this.productPrice = productPrice;

    }

    public double valuesAddition (double [] productPrice, int value) {

        totalResult += productPrice[value];

        return totalResult;

    }

    public String toString () {

        return productName + " " + "$" + productPrice;

    }

    public String getProductName () {
        return productName;
    }

    public double [] getProductPrice () {
        return productPrice;
    }

}
