package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

public final class Barbarian extends Knight {

    // barbarian is pure gas. great life points and attack damage.

    public Barbarian ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints,
                    int level, String appearance, String accessory, Abilities specialAbility ) { // constructor for other classes

        super ( lifePoints, armor, weapon, attackPoints, defensePoints, level, appearance, accessory, specialAbility );

        // thinking about methods/variables for the Barbarian class

    }

    // barbarian is going to have a whole system for attack, defense and life points

}
