package lambdaandmore.firstencounter.src.entities;

public class Product1 implements Comparable < Product1 > {

    private String name;

    private Double price;

    public Product1 () {}

    public Product1 ( String name, Double price ) {

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
    public int compareTo(Product1 o) {

        return name.toUpperCase().compareTo(o.getName().toUpperCase());

    }

    @Override
    public String toString() {
        return "Product1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
