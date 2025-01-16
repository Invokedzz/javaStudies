package lambdaandmore.firstencounter.src.entities3;

public class Product3 {

    private String name;

    private Double price;

    public Product3 () {}

    public Product3 ( String name, Double price ) {

        this.name = name;

        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
