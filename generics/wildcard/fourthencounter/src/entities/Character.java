package generics.wildcard.fourthencounter.src.entities;

public class Character {

    private String name;

    private Integer level;

    public Character () {}

    public Character ( String name, Integer level ) {

        this.name = name;

        this.level = level;

    }

    public String getName () {

        return name;

    }

    public Integer getLevel () {

        return level;

    }

    @Override
    public String toString () {

        return getName() + " " + getLevel();

    }

}
