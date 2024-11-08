package arrays.entities;

public class SecondArrayEntity {

    private final double productsValue;

    private final String productsName;

    public SecondArrayEntity (String productsName, double productsValue) {

        this.productsName = productsName;

        this.productsValue = productsValue;

    }

    public String getProductsName () {
        return productsName;
    }

    public double getProductsValue () {
        return productsValue;
    }

}
