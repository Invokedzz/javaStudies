package filejava.secondexercise.model.entities;

public class Product {

    private String productName;

    private Double productPrice;

    private Integer productQuantity;

    public Product () {}

    public Product ( String productName, Double productPrice, Integer productQuantity ) {

        this.productName = productName;

        this.productPrice = productPrice;

        this.productQuantity = productQuantity;

    }

    public String getProductName () {

        return productName;

    }

    public Double getProductPrice () {

        return productPrice;

    }

    public Integer getProductQuantity () {

        return productQuantity;

    }

    public Double pricePerQuantity () {

        return productQuantity * productPrice;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getProductName() )
                .append( ", Quantity: " ).append( getProductQuantity() )
                .append( ", Price: " ).append( pricePerQuantity() ).append( "\n" );

        return sb.toString();

    }

}
