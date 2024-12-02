package VideogameStore.model.entities;

import VideogameStore.model.enums.ProductsAvailability;

import VideogameStore.model.enums.DeliveryStatus;

public class GamesInfo {

    private final String gameName;

    private final Double gamePrice;

    private final DeliveryStatus availability;

    public GamesInfo (String gameName, Double gamePrice, DeliveryStatus availability) {

        this.gameName = gameName;

        this.gamePrice = gamePrice;

        this.availability = availability;

    }

    public static DeliveryStatus verifyAvailability (ProductsAvailability stats) {

        if (stats.equals(ProductsAvailability.OUT_OF_STOCK)) return DeliveryStatus.CANNOT_BE_SHIPPED;

        return DeliveryStatus.CAN_BE_SHIPPED;

    }

    @Override
    public String toString () {

        return "Game: " + gameName +
                " Price: " + gamePrice
                + " Stats: \n" + availability;

    }

}
