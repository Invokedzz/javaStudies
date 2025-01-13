package generics.set.firstencounter.entities;

public class Game {

    private String gameName;

    private Double gamePrice;

    public Game () {}

    public Game ( String gameName, Double gamePrice ) {

        this.gameName = gameName;

        this.gamePrice = gamePrice;

    }

    public String getGameName() {
        return gameName;
    }

    public Double getGamePrice() {
        return gamePrice;
    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Game name: " ).append( getGameName() )
                .append( ", game price: " ).append( getGamePrice() );

        return sb.toString();

    }

}
