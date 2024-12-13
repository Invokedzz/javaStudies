package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

import heritage.kingdom.entities.heritage.abilitiesenum.PassiveAbilities;

public final class Barbarian extends Knight {

    // barbarian is pure gas. great life points and attack damage.

    private double fury;

    public Barbarian ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints,
                    int level, String appearance, String accessory, Abilities specialAbility, double fury ) {

        // constructor for other classes

        super ( lifePoints, armor, weapon, attackPoints, defensePoints, level, appearance, accessory, specialAbility );

        // thinking about methods/variables for the Barbarian class

        this.fury = fury;

    }

    // barbarian is going to have a whole system for attack, defense and life points

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

    public double getFury () {

        return fury;

    }

}
