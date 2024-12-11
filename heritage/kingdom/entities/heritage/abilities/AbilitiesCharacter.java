package heritage.kingdom.entities.heritage.abilities;

public class AbilitiesCharacter {

    // class created to validate attack/defense points

    public double validateAttackPoints ( double attackPoints ) {

        // attack points, min: 5, max: 300 -> default,
        // without considering any kind of boosts or abilities

        if ( attackPoints < 5 || attackPoints > 300 ) {

            System.out.println( "You can't do any damage, LOL" );

            return 0.0;
        }

        return attackPoints;

    }

    public double validateDefensePoints ( double defensePoints ) {

        // defense points, min: 1, max: 250 -> default,
        // without considering any kind of boosts or abilities

        if ( defensePoints < 1 || defensePoints > 250 ) {

            System.out.println( "Oh, you're taking a LOT of damage LOL" );

            return 0.0;

        }

        return defensePoints;

    }

}
