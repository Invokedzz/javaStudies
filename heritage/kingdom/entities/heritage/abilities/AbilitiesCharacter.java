package heritage.kingdom.entities.heritage.abilities;

public class AbilitiesCharacter {

    // class created to validate attack/defense points

    public double validateAttackPoints ( double attackPoints, int level ) {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities
        // level limit: 1000 <-> if level == 1000, attackPoints = 300
        // if level < 1000, attackPoints = ?

        if ( attackPoints < 5 || attackPoints > 300 ) {

            System.out.println( "You can't do any damage, LOL" );

            return 0.0;
        }

        if ( level == 1000 ) {

            attackPoints = 300;

            return attackPoints; // thinking about

        }

        if ( level < 1 || level > 1000 ) {

            attackPoints = 0.0;

            level = 1;

            return attackPoints * level;

        }

        return attackPoints; // thinking about

    }

    public double validateDefensePoints ( double defensePoints, int level ) {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        if ( defensePoints < 1 || defensePoints > 250 ) {

            System.out.println( "Oh, you're taking a LOT of damage LOL" );

            return 0.0;

        }

        return defensePoints; // thinking about

    }

}
