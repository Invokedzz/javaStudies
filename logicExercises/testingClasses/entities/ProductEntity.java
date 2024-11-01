package logicExercises.testingClasses.entities;

public class ProductEntity {

    private String name;

    private double price;

    private int quantity;

    public double totalValueInStock () {

        return price * quantity;

    }

    public void addProducts (int quantity) {

        this.quantity += quantity;

    }

    public void removeProducts (int quantity) {

        this.quantity -= quantity;

    }

}
