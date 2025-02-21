package content.logicExercises.testingClasses.entities;

public class InfoEntity {

    public String productName;

    public int totalPrice;

    public int totalStock;

    public int incrementStock (int newValue) {

        this.totalStock += newValue;

        return totalStock;

    }

    public int removeCurrentStock (int newValue) {

        this.totalStock -= newValue;

        return totalStock;

    }

    public int fullPriceDisplay (int totalPrice, int totalStock) {

        this.totalStock = totalStock;

        this.totalPrice = totalPrice;

        return totalPrice * totalStock;

    }

}
