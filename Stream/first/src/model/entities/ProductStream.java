package Stream.first.src.model.entities;

public class ProductStream {

    private String name;

    private Double price;

    public ProductStream () {}

    public ProductStream ( String name, Double price ) {

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
    public String toString () {

        return name + " " + price;

    }

}
