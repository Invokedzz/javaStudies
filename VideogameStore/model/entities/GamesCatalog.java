package VideogameStore.model.entities;

import VideogameStore.model.enums.ProductsAvailability;

public class GamesCatalog {

    // class created in order to register new games on the platform

    private final String gameName;

    private final Integer gameId;

    private final ProductsAvailability isAvailable;

    public GamesCatalog (String gameName, Integer gameId, ProductsAvailability isAvailable) {

        this.gameName = gameName;

        this.gameId = gameId;

        this.isAvailable = isAvailable;

    }

    public Integer getGameId () {

        return gameId;

    }

    @Override
    public String toString () {

        return "Name: " + gameName
                + "ID: " + gameId
                + "Availability: " + isAvailable;

    }

}
