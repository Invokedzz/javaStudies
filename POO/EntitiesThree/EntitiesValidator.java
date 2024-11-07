package POO.EntitiesThree;

public class EntitiesValidator {

    // validator for id, brand, color, value and totalKms.

    public boolean validatorID (int carId) {

        return carId >= 0;

    }

    public boolean validatorCarBrand (String carBrand) {

        return carBrand.length() > 3;

    }

    public boolean validatorCarColor (String carColor) {

        return carColor.length() > 3;

    }

    public boolean validateBothValueAndKm (double totalValue, double totalKms) {

        return totalValue > 0 && totalKms > 0;

    }

}
