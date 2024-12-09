package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.Human;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

import heritage.kingdom.entities.heritage.abilities.AbilitiesCharacter;

public class Knight extends Human {

    // armor ( String ), weapon ( String ),
    // attackPoints ( double ), defensePoints ( double )

    // feelings ( String ), appearance ( String )
    // age ( int ), accessory ( String ), specialAbility ( String )

    private double lifePoints;

    private String armor;

    private String weapon;

    private double attackPoints;

    private double defensePoints;

    public Knight () {}

    public Knight ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints, int level,
                    String appearance, String feelings, int age, String accessory, Abilities specialAbility ) {

        super ( level, appearance, feelings, age, accessory, specialAbility );

        this.lifePoints = lifePoints;

        this.armor = armor;

        this.weapon = weapon;

        this.attackPoints = attackPoints;

        this.defensePoints = defensePoints;

    }

    public Knight ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints ) {

        this.lifePoints = lifePoints;

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

    public double declareLifePoints () {

        lifePoints = 8.000;

        double getLifePoints = 0;

        for ( int i = 0; i < level; i++ ) {

            getLifePoints += i;

        }

        return getLifePoints;

    }

    public double getLifePoints () {

        return lifePoints;

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
