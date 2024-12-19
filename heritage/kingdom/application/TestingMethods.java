package heritage.kingdom.application;

import heritage.kingdom.entities.exceptions.AttackPointsException;

import heritage.kingdom.entities.exceptions.InvalidLevelException;

import heritage.kingdom.entities.heritage.abilities.validateStats;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        testLevelOfCharacter ( init );

        System.out.println( "##############################" );

    }

    private static void testLevelOfCharacter ( Scanner init ) {

        try {

            validateStats character = new validateStats();

            int level = character.levelValidation ( init );

            double attackPoints = character.attackValidation ( init );

            double defensePoints = character.defensePoints ( init );

            character.validateAllMethods( level, attackPoints, defensePoints );

        } catch ( InvalidLevelException | AttackPointsException error ) {

            System.out.printf( "Error message: %s", error.getMessage() );

        }

    }

}
