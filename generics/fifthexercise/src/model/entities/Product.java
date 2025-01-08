package generics.fifthexercise.src.model.entities;

public class Product implements Comparable <Product> {

    private String productName;

    private Double productPrice;

    public Product () {}

    public Product ( String productName, Double productPrice ) {

        this.productName = productName;

        this.productPrice = productPrice;

    }

    public String getProductName () {

        return productName;

    }

    public Double getProductPrice () {

        return productPrice;

    }

    @Override
    public int compareTo ( Product o ) {

        return getProductPrice().compareTo( o.getProductPrice() );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Product name: " ).append( getProductName() )
                .append( ", Product Price: " ).append( getProductPrice() );

        return sb.toString();

    }


}
