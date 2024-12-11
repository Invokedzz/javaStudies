package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.Human;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

import heritage.kingdom.entities.heritage.abilities.AbilitiesCharacter;

public class Knight extends Human {

    // armor ( String ), weapon ( String ),
    // attackPoints ( double ), defensePoints ( double )

    // feelings ( String ), appearance ( String )
    // age ( int ), accessory ( String ), specialAbility ( String )

    private String armor;

    private String weapon;

    private double attackPoints;

    private double defensePoints;

    public Knight ( String armor, String weapon, double attackPoints, double defensePoints, int lifePoints, int level,
                    String appearance, String feelings, int age, String accessory, Abilities specialAbility ) {

        super ( lifePoints, level, appearance, feelings, age, accessory, specialAbility );

        this.armor = armor;

        this.weapon = weapon;

        this.attackPoints = attackPoints;

        this.defensePoints = defensePoints;

    }

    AbilitiesCharacter character = new AbilitiesCharacter();

    // STRENGTH_BOOST: raises the atk by 50% for 3 turns;
    // DEFENSE_BOOST: the user can't take damage for 2 turns,
    // but his atk drops by 80%.

    public double declareAttack () {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities

        double getAttackPoints = character.validateAttackPoints( attackPoints, level );

        double getValues = 0.0;

        for ( int i = 0; i < level; i++ ) {

            getValues += i + Math.ceil(Math.random());

        }

        return getAttackPoints + getValues;

    }

    public double blockAttack () {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        double getDefensePoints = character.validateDefensePoints( defensePoints, level );

        double getValues = 0.0;

        for ( int i = 0; i < level; i++ ) {

            getValues += i + Math.floor(Math.random() + 1.0);

        }

        return getDefensePoints + getValues;

    }

    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Armor: " ).append( armor )
                .append( ", Weapon: " ).append( weapon )
                .append( ", Attack Points: " ).append( attackPoints )
                .append( ", Defense Points: " ).append( defensePoints );

        return sb.toString();

    }

}
