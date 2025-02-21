package content.POO.EntitiesThree;

public class EntitiesThree {

    private final int carID;

    private final String carBrand;

    private final String carColor;

    private double totalKm;

    private double totalValue;

    public EntitiesThree (int carID, String carBrand, String carColor) {

        this.carID = carID;

        this.carBrand = carBrand;

        this.carColor = carColor;

    }

    public EntitiesThree (int carID, String carBrand, String carColor, double totalValue, double totalKm) {

        this.carID = carID;

        this.carBrand = carBrand;

        this.carColor = carColor;

        receiveTotalPrice(totalValue);

        receiveTotalKm(totalKm, totalValue);

    }

    public int getCarID() {

        return carID;

    }

    public String getCarBrand () {

        return carBrand;

    }

    public String getCarColor () {

        return carColor;

    }

    public double getTotalValue () {

        return totalValue;

    }

    public double getTotalKm () {

        return totalKm;

    }

    private void receiveTotalPrice (double receivedValue) {

        totalValue += receivedValue * 0.20 + receivedValue;

    }

    private void receiveTotalKm (double totalKmReceived, double receivedValue) {

        totalKm += totalKmReceived - (receivedValue * 0.50);

    }

    public String toString () {

        return "ID: " + carID
                + "Brand: " + carBrand
                + "Color: " + carColor
                + "Total price: R$ " + totalValue
                + "Total km: " + totalKm;

    }

}
