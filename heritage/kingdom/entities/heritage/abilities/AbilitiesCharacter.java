package heritage.kingdom.entities.heritage.abilities;

import heritage.kingdom.entities.exceptions.InvalidLevelException;

import heritage.kingdom.entities.exceptions.AttackPointsException;

import heritage.kingdom.entities.exceptions.DefensePointsException;

public class AbilitiesCharacter {

    // class created to validate attack/defense points
    // attack points, min: 5, max: 300 -> default,
    // without considering any kind of boosts or abilities
    // level limit: 1000 <-> if level == 1000, attackPoints = 300
    // if level < 1000, attackPoints = ?

    public double levelValidation ( int level ) {

        if ( level <= 0 || level > 100 ) throw new InvalidLevelException( "Enter a valid level! min: 1 / max: 100" );

        return level;

    }

    public double attackValidation ( double attackPoints ) {



    }

    public double defensePoints ( double defensePoints ) {

        

    }

}
