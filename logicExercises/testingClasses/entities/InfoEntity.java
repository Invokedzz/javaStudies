package logicExercises.testingClasses.entities;

public class InfoEntity {

    public String productName;

    public int totalPrice;

    public int totalStock;

    public double incrementStock (int newValue) {

        this.totalStock += newValue;

        return totalStock;

    }

    public double removeCurrentStock (int newValue) {

        this.totalStock -= newValue;

        return totalStock;

    }

    public double fullPriceDisplay (int totalPrice, int totalStock) {

        this.totalStock = totalStock;

        this.totalPrice = totalPrice;

        return totalPrice * totalStock;

    }

}
