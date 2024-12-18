package heritage.kingdom.entities.heritage.abilities;

import heritage.kingdom.entities.exceptions.InvalidLevelException;

import heritage.kingdom.entities.exceptions.AttackPointsException;

import heritage.kingdom.entities.exceptions.DefensePointsException;

import java.util.Scanner;

public class AbilitiesCharacter {

    // class created to validate attack/defense points
    // attack points, min: 5, max: 100 -> default,
    // without considering any kind of boosts or abilities
    // level limit: 100

    private boolean hasInt ( Scanner init ) {

        return init.hasNextInt();

    }

    private boolean hasDouble ( Scanner init ) {

        return init.hasNextDouble();

    }

    public int levelValidation ( Scanner level ) {

        int verifyLevel;

        System.out.println( "Enter your character level: " );

        while ( !hasInt ( level ) ) {

            System.out.println( "Enter a valid level!" );

            level.next();

        }

        verifyLevel = level.nextInt();

        while ( verifyLevel <= 0 || verifyLevel > 100 ) {

            System.out.println( "Enter a valid level! (max: 100/min: 1)" );

            while ( !hasInt ( level ) ) {

                System.out.println( "Enter a valid integer level!" );

                level.next();

            }

            verifyLevel = level.nextInt();

        }

        return verifyLevel;

    }

    public double attackValidation ( Scanner attackPoints ) {

        double verifyAttack;

        System.out.println( "Enter your character level: " );

        while ( !hasDouble ( attackPoints ) ) {

            System.out.println( "Enter a valid level!" );

            attackPoints.next();

        }

        verifyAttack = attackPoints.nextDouble();

        while ( verifyAttack <= 0 || verifyAttack > 100 ) {

            System.out.println( "Enter a valid level! (max: 100/min: 1)" );

            while ( !hasInt ( attackPoints ) ) {

                System.out.println( "Enter a valid integer level!" );

                attackPoints.next();

            }

            verifyAttack = attackPoints.nextDouble();

        }

        return verifyAttack;

    }

    /*public double defensePoints ( double defensePoints ) {



    }*/

}
