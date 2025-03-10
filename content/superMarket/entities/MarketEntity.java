package content.superMarket.entities;

public class MarketEntity {

    private final String productName;

    private final Integer productId;

    private Double productPrice;

    public MarketEntity (String productName, Integer productId, Double productPrice) {

        this.productName = productName;

        this.productId = productId;

        this.productPrice = productPrice;

    }

    public Double addDiscount (double percentage) {
        return productPrice -= productPrice * percentage / 100;
    }

    @Override
    public String toString () {
        return productName
                + " " + productId
                + " " + productPrice;
    }

    public Integer getProductId () {
        return productId;
    }

}
