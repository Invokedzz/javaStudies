package POO.EntitiesThree;

public class EntitiesThree {

    private int carID;

    private String carBrand;

    private String carColor;

    public entitiesThree (int carID, String carBrand, String carColor) {

        this.carID = carID;

        this.carBrand = carBrand;

        this.carColor = carColor;

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

    public String toString () {

        return "ID: " + carID
                + "Brand: " + carBrand
                + "Color: " + carColor;

    }

}
