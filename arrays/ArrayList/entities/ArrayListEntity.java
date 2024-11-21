package arrays.ArrayList.entities;

import java.util.ArrayList;

public class ArrayListEntity {

    private final String gameName;

    private final Integer gameId;

    public ArrayListEntity (String gameName, Integer gameId) {

        this.gameName = gameName;
        this.gameId = gameId;

    }

    @Override
    public String toString () {
        return gameName + " " + gameId;
    }

    public Integer getGameId () {
        return gameId;
    }

}
