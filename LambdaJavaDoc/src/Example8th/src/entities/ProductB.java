package LambdaJavaDoc.src.Example8th.src.entities;

public class ProductB {

    private String name;

    private Double price;

    public ProductB () {}

    public ProductB ( String name, Double price ) {

        this.name = name;

        this.price = price;

    }

    public String getName () {

        return name;

    }

    public Double getPrice () {

        return price;

    }

    public void setPrice ( Double price ) {

        this.price = price; // we need the "set" for the Consumer method

    }

    @Override
    public String toString() {
        return "ProductA{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
