package generics.set.firstencounter.entities;

public class Product {

    private String productName;

    private String productId;

    public Product () {}

    public Product ( String productName, String productId ) {

        this.productName = productName;

        this.productId = productId;

    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getProductName() )
                .append( ", product id: " ).append( getProductId() );

        return sb.toString();

    }

}
