package interfaces.medievalbs.model.entities;

public class Warrior extends AbstractCharacter {

    private Integer warCry;

    public Warrior () {

        super ();

    }

    public Warrior ( String name, Integer lifePoints, Phobia phobia,
                  Integer attackPoints, Integer defensePoints, Integer warCry ) {

        super ( name, lifePoints, phobia, attackPoints, defensePoints );

        this.warCry = warCry;

    }

    @Override
    public Integer attack() {

        return getAttackPoints() + warCry;

    }

    @Override
    public Integer defense() {

        return getDefensePoints() + warCry;

    }


}
