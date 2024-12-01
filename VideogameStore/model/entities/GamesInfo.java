package VideogameStore.model.entities;

import VideogameStore.model.enums.ProductsAvailability;

public class GamesInfo {

    private final String gameName;

    private Double gamePrice;

    private final ProductsAvailability availability;

    public GamesInfo (String gameName, Double gamePrice, ProductsAvailability availability) {

        this.gameName = gameName;

        this.gamePrice = gamePrice;

        this.availability = availability;

    }

    public double verifyAvailability (ProductsAvailability stats) {

        if (stats.equals(ProductsAvailability.OUT_OF_STOCK)) return gamePrice = 0.0;

        return gamePrice;

    }

    @Override
    public String toString () {

        return "Game: " + gameName +
                " Price: " + gamePrice
                + " Stats: " + availability;

    }

}
