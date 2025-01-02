package interfaces.medievalbs.model.entities;

public class Mage extends AbstractCharacter {

    private Integer mana;

    public Mage () {

        super ();

    }

    public Mage ( String name, Integer lifePoints, Phobia phobia,
                  Integer attackPoints, Integer defensePoints, Integer mana ) {

        super ( name, lifePoints, phobia, attackPoints, defensePoints );

        this.mana = mana;

    }

    public Integer getMana () {

        return mana;

    }

    @Override
    public Integer attack () {

        return getAttackPoints() + mana;

    }

    @Override
    public Integer defense() {

        return getDefensePoints() + mana;

    }


}
