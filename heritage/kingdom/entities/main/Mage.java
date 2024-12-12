package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.abilitiesenum.PassiveAbilities;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

public final class Mage extends Knight {

    // a mage can deal great damage, but have a poor defense overall

    // mage is going to have a whole system for attack, defense and life points

    public Mage ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints,
                       int level, String appearance, String accessory, Abilities specialAbility ) {

        // constructor for other classes

        super ( lifePoints, armor, weapon, attackPoints, defensePoints, level, appearance, accessory, specialAbility );

        // thinking about methods/variables for the Mage class

    }

    @Override
    public double declareAttack () {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities

        double getAttackPoints = character.validateAttackPoints( attackPoints, level );

        double getValues = 0.0;

        for ( int i = 0; i < level; i++ ) {

            getValues += Math.ceil(Math.random() * (level + 1));

        }

        return getAttackPoints + getValues;

    }

    @Override
    public double blockAttack () {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        // getValues += Math.floor(Math.random() * (level + 1));

        double getDefensePoints = character.validateDefensePoints( defensePoints, level );

        double getValues = 0.0;

        for ( int i = 0; i < level; i++ ) {

            getValues += Math.floor(Math.random() * (level + 1));

        }

        return getDefensePoints + getValues;

    }

    @Override
    public double calculateLifePoints () {

        lifePoints = 8.000;

        double getLifePoints = 0;

        for ( int i = 0; i < level; i++ ) {

            getLifePoints += i;

        }

        return getLifePoints;

    }

}
