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

    private Integer getLifePoints () {

        return lifePoints;

    }

    private Phobia getPhobia () {

        return phobia;

    }

    private Integer getAttackPoints () {

        return attackPoints;

    }

    private Integer getDefensePoints () {

        return defensePoints;

    }

}
