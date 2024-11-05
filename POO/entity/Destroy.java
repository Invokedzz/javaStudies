package POO.entity;

public class Destroy {

    public String receiveName;

    public double totalValue;

    public double addToValue;

    public Destroy (String receiveName, double totalValue, double addToValue) {

        this.receiveName = receiveName;

        this.addToValue = addToValue;

        this.totalValue = totalValue;

    }

    public String toString () {

        return receiveName
                + " " +
                addToValue
                + " " +
                totalValue;

    }

    public double addToTotalValue (double addToValue, double totalValue) {

        return totalValue + addToValue;

    }

}
