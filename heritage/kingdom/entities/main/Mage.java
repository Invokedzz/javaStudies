package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.abilitiesenum.PassiveAbilities;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

public final class Mage extends Knight {

    // a mage can deal great damage, but have a poor defense overall

    // mage is going to have a whole system for attack, defense and life points

    private double mana;

    public Mage ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints,
                       int level, String appearance, String accessory, Abilities specialAbility, double mana ) {

        // constructor for other classes

        super ( lifePoints, armor, weapon, attackPoints, defensePoints, level, appearance, accessory, specialAbility );

        // thinking about methods/variables for the Mage class

        this.mana = mana;

    }

    @Override
    public double declareAttack () {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities

        return 1;

    }

    @Override
    public double blockAttack () {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        // getValues += Math.floor(Math.random() * (level + 1));

        return 1;

    }

    @Override
    public double calculateLifePoints () {

        return 1;

    }

    public double getMana () {

        return mana;

    }

}
