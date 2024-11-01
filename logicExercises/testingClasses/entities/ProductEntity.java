package logicExercises.testingClasses.entities;

public class ProductEntity {

    public String name;

    public double price;

    public int quantity;

    public double totalValueInStock () {

        return price * quantity;

    }

    public void addProducts (int quantity) {

        System.out.println(this.quantity += quantity);
    }

    public void removeProducts (int quantity) {

        this.quantity -= quantity;

    }

}
