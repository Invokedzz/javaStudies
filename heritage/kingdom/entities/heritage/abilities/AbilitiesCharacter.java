package heritage.kingdom.entities.heritage.abilities;

import heritage.kingdom.entities.exceptions.InvalidLevelException;

import heritage.kingdom.entities.exceptions.AttackPointsException;

import heritage.kingdom.entities.exceptions.DefensePointsException;

import java.util.Scanner;

public class AbilitiesCharacter {

    // class created to validate attack/defense points
    // attack points, min: 5, max: 300 -> default,
    // without considering any kind of boosts or abilities
    // level limit: 1000 <-> if level == 1000, attackPoints = 300
    // if level < 1000, attackPoints = ?

    private boolean verifyInt ( Scanner init ) {

        return init.hasNextInt();

    }

    public int levelValidation ( Scanner level ) {

        int verifyLevel;

        System.out.println( "Enter your character level: " );

        while ( !verifyInt ( level ) ) {

            System.out.println( "Enter a valid level!" );

            level.next();

        }

        verifyLevel = level.nextInt();

        while ( verifyLevel <= 0 || verifyLevel > 100 ) {

            System.out.println( "Enter a valid level! (max: 100/min: 1)" );

            while ( !verifyInt ( level ) ) {

                System.out.println( "Enter a valid integer level!" );

                level.next();

            }

            verifyLevel = level.nextInt();

        }

        return verifyLevel;

    }

    /*public double attackValidation ( double attackPoints ) {

        if ( attackPoints < 0)

    } */

    /*public double defensePoints ( double defensePoints ) {



    }*/

}
