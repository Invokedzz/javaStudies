package LambdaJavaDoc.src.SmallExercise.src.model.entities;

public class ProductAB {

    private String name;

    private Double price;

    public ProductAB () {}

    public ProductAB ( String name, Double price ) {

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
        return "ProductA{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
