package lambdaandmore.firstencounter.src.entities2;

public class Product2 {

    private String name;

    private Double price;

    public Product2 () {}

    public Product2 ( String name, Double price ) {

        this.name = name;

        this.price = price;

    }

    public String getName () {

        return name;

    }

    public Double getPrice () {

        return price;

    }

    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
