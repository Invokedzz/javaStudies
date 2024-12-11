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

    public double declareAttack () {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities

        double getAttackPoints = character.validateAttackPoints( attackPoints, level );

        double getValues = 0;

        for ( int i = 0; i < level; i++ ) {

            getValues += i + Math.ceil(Math.random());

        }

        return getAttackPoints + getValues;

    }

    public double blockAttack () {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        double getDefensePoints = character.validateDefensePoints( defensePoints, level );

    }

    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( " Armor: " ).append( armor )
                .append( " Weapon: " ).append( weapon )
                .append( " Attack Points: " ).append( attackPoints )
                .append( " Defense Points: " ).append( defensePoints );

        return sb.toString();

    }

}
