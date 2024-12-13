package POO.onemoreexercise.entities;

public class Product {

    private String name;

    private double price;

    public Product () {}

    public Product ( String name, double price ) {

        this.name = name;

        this.price = price;

    }

    public String priceTag () {

        return name +
                " $ " + price;

    }

}
