package VideogameStore.model.entities;

import VideogameStore.model.entities.GamesInfo;

import java.time.LocalDate;

public class GamesOverlook {

    private final LocalDate releaseGameDate;

    private final String gameGenre;

    private final GamesInfo gamesInfo;

    public GamesOverlook (LocalDate releaseGameDate, String gameGenre, GamesInfo gamesInfo) {

        this.releaseGameDate = releaseGameDate;

        this.gameGenre = gameGenre;

        this.gamesInfo = gamesInfo;

    }

    @Override
    public String toString () {

        return "Release: " + releaseGameDate
                + " Genre: " + gameGenre
                + " Info: " + gamesInfo;

    }

}
