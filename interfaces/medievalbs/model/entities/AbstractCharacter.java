package interfaces.medievalbs.model.entities;

import interfaces.medievalbs.model.services.Character;

public abstract class AbstractCharacter implements Character {

    private String name;

    private Integer lifePoints;

    private Phobia phobia;

    private Integer attackPoints;

    private Integer defensePoints;

    public AbstractCharacter () {}

    public AbstractCharacter ( String name, Integer lifePoints, Phobia phobia, Integer attackPoints, Integer defensePoints ) {

        this.name = name;

        this.lifePoints = lifePoints;

        this.phobia = phobia;

        this.attackPoints = attackPoints;

        this.defensePoints = defensePoints;

    }

    public String getName () {

        return name;

    }

    public Integer getLifePoints () {

        return lifePoints;

    }

    public Phobia getPhobia () {

        return phobia;

    }

    public Integer getAttackPoints () {

        return attackPoints;

    }

    public Integer getDefensePoints () {

        return defensePoints;

    }

}
