package filejava.exercise.model.entities;

public class Product {

    private String productName;

    private double productPrice;

    private int productQuantity;

    public Product () {}

    public Product ( String productName, double productPrice, int productQuantity ) {

        this.productName = productName;

        this.productPrice = productPrice;

        this.productQuantity = productQuantity;

    }

    public String getProductName () {

        return productName;

    }

    public double getProductPrice () {

        return productPrice;

    }

    public int getProductQuantity () {

        return productQuantity;

    }

    public double pricePerQuantity () {

        return getProductPrice() * getProductQuantity();

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getProductName() )
                .append( " Price: " ).append( pricePerQuantity() ).append( "\n" );

        return sb.toString();

    }

}
